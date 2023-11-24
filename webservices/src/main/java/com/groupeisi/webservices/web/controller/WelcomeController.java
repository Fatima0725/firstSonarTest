package com.groupeisi.webservices.web.controller;

import com.groupeisi.metier.DepotServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        DepotServices depotServices = new DepotServices();
        return "welcome";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
