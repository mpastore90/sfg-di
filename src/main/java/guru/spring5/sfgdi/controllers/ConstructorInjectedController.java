package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingServices greetingServices;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServices") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
