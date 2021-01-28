package fr.ubo.tpspring.web;

import java.util.concurrent.atomic.AtomicLong;

import fr.ubo.tpspring.entities.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/")
    public String index(){
        return  "essayer url : http://*****.com/greeting";
    }

    @GetMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable(value = "name") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "fournir un nom svp \n :  http://******/greeting/{votre nom}";
    }
}
