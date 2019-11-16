package se.iix.springbackend.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import se.iix.springbackend.model.User

@Repository
interface UserRepository : CrudRepository<User, Int>