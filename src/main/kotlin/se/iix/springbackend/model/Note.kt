package se.iix.springbackend.model

import java.io.Serializable
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "notes")
class Note : Serializable {
    @Id
    @GeneratedValue
    var id: Int? = null
    var title: String? = null
    var text: String? = null
    var date: LocalDate? = null
}