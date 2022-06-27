package ca.rjdsilv.jarischallenge.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void testPersonBuilder() {
        var person =  Person.builder()
                .firstName("John")
                .lastName("Testman")
                .age(25)
                .build();

        assertEquals("John", person.getFirstName());
        assertEquals("Testman", person.getLastName());
        assertEquals(25, person.getDetails().getAge());
        assertEquals(person, person.getDetails().getPerson());
    }
}
