package com.radar.Controllers;

import com.radar.JPA.Entities.DentistEntity;
import com.radar.JPA.Entities.ReferredOfficeEntity;
//import com.radar.JPA.Entities.ReferringOfficeEntity;
//import com.radar.JPA.Entities.UserAccount;
import com.radar.JPA.Repositories.DentistRepository;
import com.radar.JPA.Repositories.ReferredOfficeRepository;
//import com.radar.JPA.Repositories.ReferringOfficeRepository;
//import com.radar.JPA.Repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Skradski on 6/21/2019.
 */

@Controller
public class TestController {

//    @Autowired
//    ReferringOfficeRepository referringOfficeRepository;

    @Autowired
    ReferredOfficeRepository referredOfficeRepository;

    @Autowired
    DentistRepository dentistRepository;

    @RequestMapping("/testApp")
    public String testing(){
        return "Test successful";
    }

//    @RequestMapping("/testGetReferringOffice")
//    public List<ReferringOfficeEntity> testReferringOffice(){
//        return (List<ReferringOfficeEntity>) referringOfficeRepository.findAll();
//    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Strange User") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/testReferredOffice")
    public List<ReferredOfficeEntity> testReferredOffice(){
        return (List<ReferredOfficeEntity>) referredOfficeRepository.findAll();
    }

    @RequestMapping("/testDentist")
    public List<DentistEntity> testDentist(){
        return (List<DentistEntity>) dentistRepository.findAll();
    }
}
