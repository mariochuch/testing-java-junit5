package guru.springframework.sfgpetclinic.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        Person person = new Person(1L, "Mariusz", "Test");

        assertAll("Test Property Set",
                () -> assertEquals( "Mariusz", person.getFirstName()),
                () -> assertEquals( "Test", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsg() {
        Person person = new Person(1L, "Mariusz", "Test");

        assertAll("Test Property Set",
                () -> assertEquals( "Mariusz", person.getFirstName(),"First Name Failed"),
                () -> assertEquals( "Test", person.getLastName(), "Last Name Failed"));
    }
}