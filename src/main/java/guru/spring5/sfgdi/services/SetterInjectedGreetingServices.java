package guru.spring5.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServices implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - Greeting - Setter";
    }
}
