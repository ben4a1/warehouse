package by.paramonov.warehouse.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    public String start(@RequestParam(required = false) String name) {
        return "Hello, " + name;
    }
}
