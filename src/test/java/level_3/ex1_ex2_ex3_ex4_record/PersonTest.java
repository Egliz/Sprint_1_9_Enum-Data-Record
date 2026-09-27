package level_3.ex1_ex2_ex3_ex4_record;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void personHasNameAndAge() {
        Person person = new Person("Maria", 20);

        assertEquals("Maria", person.name());
        assertEquals(20, person.age());
    }

    @Test
    void fullNameReturnsNameAndSurname() {
        Person person = new Person("Cristian", 28);

        assertEquals("My full name is Cristian Garcia", person.fullName("Garcia"));
    }

    @Test
    void personCannotHaveNegativeAge() {
        assertThrows(IllegalArgumentException.class, () ->
                new Person("Ana", -1));
    }

    @Test
    void personIsAdult() {
        Person person = new Person("Sara", 43);

        assertTrue(person.legalAge());
    }



}
