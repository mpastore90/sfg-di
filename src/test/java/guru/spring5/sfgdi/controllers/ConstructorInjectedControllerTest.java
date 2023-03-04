package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}