package com.map.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PolygonController {

    @GetMapping("/")
    public String index() {
        return "map";
    }

    @PostMapping("/savePolygon")
    public String savePolygon(@RequestBody String coordinates) {
        System.out.println("координаты полигона: " + coordinates);
        return "redirect:/map";
    }
}