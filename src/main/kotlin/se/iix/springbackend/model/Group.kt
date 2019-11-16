package se.iix.springbackend.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "groups")
class Group : Serializable {
    @Id
    @GeneratedValue
    var id: Int? = null
    var name: String? = null
}