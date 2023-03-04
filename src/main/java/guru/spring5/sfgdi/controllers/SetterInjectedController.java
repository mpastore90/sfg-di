package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.GreetingServices;

public class SetterInjectedController {
    private GreetingServices greetingServices;


    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
