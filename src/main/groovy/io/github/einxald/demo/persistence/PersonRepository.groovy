package io.github.einxald.demo.persistence

import io.github.einxald.demo.domain.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository extends CrudRepository<Person, Long> {
}
