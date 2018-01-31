package ml.ledv.docker.plugin.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Main {

    public static void main(String args []){
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }
}