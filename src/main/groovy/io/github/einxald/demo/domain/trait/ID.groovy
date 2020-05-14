package io.github.einxald.demo.domain.trait

import javax.persistence.GeneratedValue
import javax.persistence.Id

trait ID {

    @Id
    @GeneratedValue
    long id

}