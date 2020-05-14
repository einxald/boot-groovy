package io.github.einxald.demo.service

import io.github.einxald.demo.domain.Person
import io.github.einxald.demo.persistence.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service;

@Service
class PersonService {

    @Autowired
    PersonRepository personRepository

    Person create(Person person) {
        personRepository.save(person)
    }

    Iterable<Person> findAll() {
        personRepository.findAll()
    }

}
