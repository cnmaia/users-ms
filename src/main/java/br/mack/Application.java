package br.mack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cmaia on 09/10/16
 */
@ComponentScan({
        "br.mack.controller",
        "br.mack.repository",
        "br.mack.service"
})
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
