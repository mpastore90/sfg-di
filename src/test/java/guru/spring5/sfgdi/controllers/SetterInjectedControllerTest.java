package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.ConstructorGreetingServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingServices());
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}