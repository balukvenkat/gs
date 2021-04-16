package com.bkv.gs.ctlr;

import com.bkv.gs.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/gs")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        long i = counter.incrementAndGet();


        LOG.info("Request Count: "+i);
        LOG.info(" name: "+i);
        return new Greeting(i, String.format(template, name));
    }
}
