package com.llc.radar.Controllers;

import com.llc.radar.JPA.Entities.UserAccount;
import com.llc.radar.JPA.Repositories.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Skradski on 6/21/2019.
 */

@RestController
public class TestController {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @RequestMapping("/createuseraccount")
    public UserAccount createUserAccount(@RequestParam(value="username") String username,
                               @RequestParam(value="password") String password,
                               @RequestParam(value="isPremiumUser") boolean isPremiumUser){

        UserAccount userAccount = new UserAccount(username, password, isPremiumUser);

        userAccountRepository.save(userAccount);
        return userAccount;
    }

    @RequestMapping("/")
    public String testing(){
        return "Test successful";
    }
}
