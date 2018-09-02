package de.evenos.cantacal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
    @GetMapping("/")
    public String index(
        @RequestParam(required = false, defaultValue = "world") String name
    ) {
        return String.format("Hello %s :-)", name);
    }
}
