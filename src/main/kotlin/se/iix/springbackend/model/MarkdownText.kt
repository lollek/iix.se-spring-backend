package se.iix.springbackend.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name="markdown_texts")
class MarkdownText : Serializable {
    @Id
    @GeneratedValue
    var id: Int? = null
    var name: String? = null
    var data: String? = null
}