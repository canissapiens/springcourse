package pl.mirek.springcourse.config;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
// wlasny plik konfiguracyjny
// uzywamy "/" nie "\"
// jesli jest "\" to nie dziala w Linuxie
@PropertySource(value = "file:./conf.ini")
public class ConfD {

    @Value("${my-param.author}")
    private String author;

    @EventListener(ApplicationReadyEvent.class)
    private void greetings() {
        System.out.println("ConfD.class says: Hello " + author + "!");
    }
}
