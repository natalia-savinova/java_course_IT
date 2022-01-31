package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    void localSetup() {
        System.out.println("Before a method in the class");
    }


    @AfterEach
    void localTeardown() {
        System.out.println("After a method in the class");
    }
}
