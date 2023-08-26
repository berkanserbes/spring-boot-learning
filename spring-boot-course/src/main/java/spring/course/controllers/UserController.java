package spring.course.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/getUser")
    public String getUser() {
        return "<html><body><h1>Berkan</h1></body></html>";
    }
}
