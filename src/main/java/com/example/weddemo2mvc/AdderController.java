package com.example.weddemo2mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdderController {

    @GetMapping("/add")
    public String addForm() {
        return "addresult";
    }

    @GetMapping("/add2/{tal1}/{tal2}")
    public String add2(@PathVariable int tal1, @PathVariable int tal2, Model m) {
        int sum = tal1 + tal2;
        m.addAttribute("summa", sum);
        return "addresult";
    }

    @PostMapping("/add")
    public String add(@RequestParam int i, @RequestParam int j, Model m) {
        int sum = i + j;
        m.addAttribute("summa", sum);
        return "addresult";
    }

}
