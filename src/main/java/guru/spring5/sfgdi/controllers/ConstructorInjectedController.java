package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.GreetingServices;

public class ConstructorInjectedController {
    private final GreetingServices greetingServices;

    public ConstructorInjectedController( GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
