package io.github.einxald.demo.web.rest.controller

import io.github.einxald.demo.domain.Person
import io.github.einxald.demo.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController {

    @Autowired
    PersonService personService

    @PostMapping
    ResponseEntity<Person> createPerson(@RequestBody Person person) {
        ResponseEntity.ok(personService.create(person))
    }

    @GetMapping
    ResponseEntity<Iterable<Person>> getPersons() {
        ResponseEntity.ok(personService.findAll());
    }

}
