package cat.itacademy.s04.t01.n01.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public static ResponseEntity<String> greet(@RequestParam(value = "name", defaultValue = "UNKNOW") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Hello %s!", name));
    }

    @GetMapping("/HelloWorld2/{name}")
    public static ResponseEntity<String> greet2(@PathVariable(value = "name", required = false) String name) {
        return ResponseEntity.status(HttpStatus.OK).body(String.format("Hello %s!", name));
    }

}