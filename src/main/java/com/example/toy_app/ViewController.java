package com.example.toy_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/") 
class ViewController {
    @GetMapping
    public String view() {
        return "view";
    } 
}
