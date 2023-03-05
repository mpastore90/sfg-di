package guru.spring5.sfgdi.controllers;

import guru.spring5.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServices")
    @Autowired
    public GreetingServices greetingServices;

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
