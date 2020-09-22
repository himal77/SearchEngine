package com.BIT10NP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("querybox") String query) {
        if(query == "") return new RedirectView("home");
        String url = "https://www.google.com/search?q=" + query;
        RedirectView rv = new RedirectView();
        rv.setUrl(url);
        return rv;
    }
}
