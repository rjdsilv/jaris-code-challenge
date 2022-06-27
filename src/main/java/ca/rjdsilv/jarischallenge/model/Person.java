package ca.rjdsilv.jarischallenge.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {
    private String firstName;
    private String lastName;
    private PersonDetails details;

    public static class PersonBuilder {
        private int age;

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            var personDetails = new PersonDetails();
            var person = new Person(firstName, lastName, personDetails);
            personDetails.setAge(age);
            personDetails.setPerson(person);
            return person;
        }
    }
}
