package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServices());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}