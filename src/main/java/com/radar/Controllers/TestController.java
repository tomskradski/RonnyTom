package com.radar.Controllers;

import com.radar.JPA.Entities.Dentist;
import com.radar.JPA.Entities.ReferredOffice;
//import com.radar.JPA.Entities.ReferringOffice;
//import com.radar.JPA.Entities.UserAccount;
import com.radar.JPA.Repositories.DentistRepository;
import com.radar.JPA.Repositories.ReferredOfficeRepository;
//import com.radar.JPA.Repositories.ReferringOfficeRepository;
//import com.radar.JPA.Repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Skradski on 6/21/2019.
 */

@RestController
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
//    public List<ReferringOffice> testReferringOffice(){
//        return (List<ReferringOffice>) referringOfficeRepository.findAll();
//    }

    @RequestMapping("/testReferredOffice")
    public List<ReferredOffice> testReferredOffice(){
        return (List<ReferredOffice>) referredOfficeRepository.findAll();
    }

    @RequestMapping("/testDentist")
    public List<Dentist> testDentist(){
        return (List<Dentist>) dentistRepository.findAll();
    }
}
