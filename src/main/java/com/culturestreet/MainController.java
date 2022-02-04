package com.culturestreet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class MainController {
    @GetMapping(value = "")
    public String mainPage() {
        return "index";
    }
}
