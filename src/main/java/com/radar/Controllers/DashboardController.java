package com.radar.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    // Todo: pass method dynamic button list
    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
}
