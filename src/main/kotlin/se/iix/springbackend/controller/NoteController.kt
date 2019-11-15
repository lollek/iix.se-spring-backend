package se.iix.springbackend.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.webmvc.ResourceNotFoundException
import org.springframework.web.bind.annotation.*
import se.iix.springbackend.model.Note
import se.iix.springbackend.repository.NoteRepository
import java.util.*
import javax.annotation.Resource

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    private lateinit var noteRepository: NoteRepository

    @GetMapping("/{id}")
    fun getNote(@PathVariable id: Int): Note {
        return noteRepository.findById(id).orElseThrow { ResourceNotFoundException() }
    }

    @GetMapping()
    fun getNotes(): MutableIterable<Note> {
        return noteRepository.findAll()
    }

    @PostMapping()
    fun saveNote(@RequestBody note: Note): Note {
        return noteRepository.save(note)
    }

    @PutMapping("/{id}")
    fun updateNote(@PathVariable id: Int, @RequestBody note: Note): Note? {
        getNote(id)
        note.id = id
        return noteRepository.save(note)
    }

    @DeleteMapping("/{id}")
    fun deleteNote(@PathVariable id: Int) {
        return noteRepository.deleteById(id)
    }

}

