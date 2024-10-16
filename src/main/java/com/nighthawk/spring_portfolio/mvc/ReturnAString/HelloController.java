package com.nighthawk.spring_portfolio.mvc.ReturnAString;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello/{yo}")
    public ResponseEntity<String> hello(@PathVariable String yo) {
        String responseMessage = "hello " + yo;
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }
}