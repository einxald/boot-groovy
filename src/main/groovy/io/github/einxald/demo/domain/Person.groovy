package io.github.einxald.demo.domain

import io.github.einxald.demo.domain.trait.ID

import javax.persistence.Entity

@Entity
class Person implements ID {

    String name

}
