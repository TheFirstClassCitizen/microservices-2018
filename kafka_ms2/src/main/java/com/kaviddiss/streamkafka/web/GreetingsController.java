package com.kaviddiss.streamkafka.web;

import com.kaviddiss.streamkafka.model.Greetings;
import com.kaviddiss.streamkafka.service.GreetingsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/kafka")
public class GreetingsController {
    private final GreetingsService greetingsService;

    public GreetingsController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void hello(@RequestParam("message") String message) {
        Greetings greetings = Greetings.builder().message(message).timestamp(System.currentTimeMillis()).build();

        greetingsService.sendGreeting(greetings);
    }
}
