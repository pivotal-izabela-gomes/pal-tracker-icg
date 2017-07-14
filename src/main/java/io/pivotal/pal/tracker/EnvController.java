package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pivotal on 7/14/17.
 */
@RestController
public class EnvController {

    private String port;
    private String cfInstanceIndex;
    private String memoryLimit;
    private String cfInstanceAddr;

    public EnvController(@Value("${PORT:NOT SET}") String port,
                         @Value("${CF_INSTANCE_INDEX:NOT SET}") String cfInstanceIndex,
                         @Value("${MEMORY_LIMIT:NOT SET}") String memoryLimit,
                         @Value("${CF_INSTANCE_ADDR:NOT SET}") String cfInstanceAddr) {

        this.port = port;
        this.cfInstanceIndex = cfInstanceIndex;
        this.memoryLimit = memoryLimit;
        this.cfInstanceAddr = cfInstanceAddr;
    }

    @GetMapping("/env")
    public Map<String, String> getEnv() {
        Map<String, String> env = new HashMap<>();
        env.put("PORT", port);
        env.put("CF_INSTANCE_INDEX", cfInstanceIndex);
        env.put("MEMORY_LIMIT", memoryLimit);
        env.put("CF_INSTANCE_ADDR", cfInstanceAddr);
        return env;
    }
}
