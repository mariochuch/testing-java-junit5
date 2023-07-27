package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Mariusz", "Test");
        owner.setCity("Nawojowa");
        owner.setTelephone("1231231234");

        assertAll("Properties Test",
                () -> assertAll("Testing Person Properties",
                    () -> assertEquals("Mariusz", owner.getFirstName(), "First Name didn't match"),
                    () -> assertEquals("Test", owner.getLastName(), "Last Name didn't match")
                ),
                () -> assertAll("Testing Owner Properties",
                        () -> assertEquals("Nawojowa", owner.getCity(), "City didn't match"),
                        () -> assertEquals("1231231234", owner.getTelephone(), "Telephone didn't match")

                ));

    }
}