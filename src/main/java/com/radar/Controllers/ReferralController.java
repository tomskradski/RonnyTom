package com.radar.Controllers;

import com.radar.Models.Referral;
import com.radar.Services.ReferralService;
import com.radar.Services.ReferralServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReferralController {

    @Autowired
    ReferralService referralService;

    @GetMapping("/referral")
    public String greeting(Model model){
        model.addAttribute("referral", new Referral());
        return "referral";
    }

    @PostMapping("/referral")
    public String submitReferral (@ModelAttribute Referral referral){
        if (referralService.processNewReferral(referral)){
            return "result";
        }
        else {
            return "failed";
        }
    }
}
