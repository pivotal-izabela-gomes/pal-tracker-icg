package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pivotal on 7/14/17.
 */
@RestController
public class TrackerController {

    @GetMapping
    public String getMessage() {
        return "hello";
    }
}
