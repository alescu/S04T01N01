package cat.itacademy.s04.t01.n01.S04T01N01.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public static String saluda(@RequestParam(value = "name", defaultValue = "UNKNOW") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/HelloWorld2/{name}")
    public static String saluda2(@PathVariable(value = "name", required = false) String name) {
        return String.format("Hello %s!", name);
    }

}