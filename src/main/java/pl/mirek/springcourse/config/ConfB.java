package pl.mirek.springcourse.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my-param")
public class ConfB {

    // musi byc setter
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @EventListener(ApplicationReadyEvent.class)
    private void greetings() {
        System.out.println("ConfB.class says: Hello " + name + "!");
    }

}
