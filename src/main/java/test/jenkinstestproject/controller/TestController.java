package test.jenkinstestproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "hello! world!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "heeeeeeello";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "heeeeeeello";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "heeeeeeello";
    }
}
