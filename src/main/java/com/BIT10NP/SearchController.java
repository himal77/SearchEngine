package com.BIT10NP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
}
