package se.iix.springbackend.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import se.iix.springbackend.model.Group
import se.iix.springbackend.model.User

@Repository
interface GroupRepository : CrudRepository<Group, Int>