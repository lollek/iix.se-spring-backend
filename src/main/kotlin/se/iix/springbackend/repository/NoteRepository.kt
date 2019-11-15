package se.iix.springbackend.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import se.iix.springbackend.model.Note

@Repository
interface NoteRepository : CrudRepository<Note, Int> {
    @Query("select id, title, date from notes")
    override fun findAll(): MutableIterable<Note>
}