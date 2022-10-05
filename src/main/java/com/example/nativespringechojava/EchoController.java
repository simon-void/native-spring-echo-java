package com.example.nativespringechojava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo/{msg}")
    public String echo(@PathVariable String msg) {
        return msg;
    }
}
