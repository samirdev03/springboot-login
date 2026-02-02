package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")

public class Controller {

    @GetMapping("/hello")
    public Map<String, String> hello(){
        return Map.of("message", "Diese Nachricht kommt von SpringBoot");
    }
    @GetMapping("/user")
    public Map<String, String> user(){
        return Map.of("name", "Samir",
                        "rolle", "Admin");
    }
    @PostMapping("/login")
    public Map<String, Boolean> login(@RequestBody Map<String,String> user) {
        String name = user.get("user_name");
        String password = user.get("password");

        boolean success = "Samir".equals(name) && "123".equals(password);
        return Map.of("success", success);
    }

}
