package com.kulsin.resource;

import com.kulsin.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    @Autowired
    private DummyService service;

    @GetMapping("/bar")
    public String getBar() {
        return service.printMessage("Hej Bar!");
    }

}
