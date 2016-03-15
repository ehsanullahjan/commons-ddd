package com.octiumsoft.commons.domain.model

import spock.lang.Specification

class AbstractEntitySpec extends Specification {
    private final class Customer extends AbstractEntity<UUID> {
        final UUID id
        final String name

        Customer(UUID id, String name) {
            this.id = id
            this.name = name
        }
    }

    def "Entity equality is based squarely on ID"() {
        given: "some entities"
        UUID id = UUID.randomUUID()
        Customer john = new Customer(id, "John Smith")
        Customer johny = new Customer(id, "Johny Depp")
        Customer jane = new Customer(UUID.randomUUID(), "Jane Smith")

        expect: "entities are considered equal iff their IDs match"
        john == johny
        john != jane

        and: "entity hashcodes are consistent with their equality"
        john.hashCode() == johny.hashCode()
        john.hashCode() != jane.hashCode()
    }
}
