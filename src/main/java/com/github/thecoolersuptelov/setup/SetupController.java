package com.github.thecoolersuptelov.setup;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/api/")
public class SetupController {

    @GetMapping(value = "greeting")
    public String getMethodName() {
        return "Hello!";
    }

}
