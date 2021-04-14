package com.bkv.gs.ctlr;

import com.bkv.gs.model.Greeting;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/gs")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        long i = counter.incrementAndGet();
        System.out.println("Request Count: "+i);
        System.out.println(" name: "+i);
        return new Greeting(i, String.format(template, name));
    }
}
