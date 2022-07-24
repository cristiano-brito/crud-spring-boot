package br.com.springboot.crud;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController {

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String crudController(@PathVariable String name) {
        return "CRUD Spring Boot: " + name + "!";
    }
}
