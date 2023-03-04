package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.GreetingServices;

public class PropertyInjectedController {

    public GreetingServices greetingServices;

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
