package pl.mirek.springcourse.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfC {

    // parametry z pliku application.properties
    private Environment environment;

    @Autowired
    public ConfC(Environment environment) {
        this.environment = environment;
    }

    @EventListener(ApplicationReadyEvent.class)
    private void greetings() {
        System.out.println("ConfC.class says: Hello " + environment.getProperty("my-param.name") + "!");
    }
}
