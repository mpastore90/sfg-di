package guru.spring5.sfgdi.services;

public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World - Greeting";
    }
}
