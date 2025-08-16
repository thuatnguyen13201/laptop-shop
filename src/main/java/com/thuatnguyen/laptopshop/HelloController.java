package com.thuatnguyen.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello";
    }

    @GetMapping("/user")
    public String getUser() {
        return "User";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Admin";
    }
}
