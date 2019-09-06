package com.radar.Controllers;

import com.radar.Models.Referral;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReferralController {

    @GetMapping("/referral")
    public String greeting(Model model){
        model.addAttribute("referral", new Referral());
        return "referral";
    }

    @PostMapping("/referral")
    public String submitReferral (@ModelAttribute Referral referral){

        return "result";
    }
}
