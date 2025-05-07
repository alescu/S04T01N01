package cat.itacademy.s04.t01.n01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handlerNoHandlerFoundException(Exception ex) {
        StringBuilder strb = new StringBuilder("LA RUTA SOL·LICITADA NO EXISTEIX");
        strb.append("<p>Opcions vàlides son: </p>");
        strb.append("<p> - http://localhost:9000/HelloWorld</p>");
        strb.append("<p> - http://localhost:9000/HelloWorld?nom=nomXXX</p>");
        strb.append("<p> - http://localhost:9000/HelloWorld2</p>");
        strb.append("<p> - http://localhost:9000/HelloWorld2/nomXXX</p>");
        return new ResponseEntity<>(strb.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
