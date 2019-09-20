package pl.mirek.springcourse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConfA {

    @Value("${my-param.name}")
    private String name;

    @EventListener(ApplicationReadyEvent.class)
    private void greetings() {
        System.out.println("ConfA.class says: Hello " + name + "!");
    }
}
