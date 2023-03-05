package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingServices = new ConstructorGreetingServices();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}