package se.iix.springbackend.model

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name="users")
class User : Serializable {
    @Id
    @GeneratedValue
    var id: Int? = null
    var username: String? = null
    var password: String? = null
}