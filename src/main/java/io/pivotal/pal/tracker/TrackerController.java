package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pivotal on 7/14/17.
 */
@RestController
public class TrackerController {

    @Value("${welcome_message}")
    private String message;

    @GetMapping
    public String getMessage() {
        return message;
    }
}
