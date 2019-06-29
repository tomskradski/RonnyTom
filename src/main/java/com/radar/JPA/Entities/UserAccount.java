package com.radar.JPA.Entities;

import javax.persistence.*;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private boolean isPremiumUser;

    // default constructor used by JPA
    protected UserAccount(){}

    public UserAccount(String userName, String password, boolean isPremiumUser){
        this.userName = userName;
        this.password = password;
        this.isPremiumUser = isPremiumUser;
    }

    @Override
    public String toString(){
        return String.format("UserAccount[id=%d, username='%s', password='%s']", id, userName, password);
    }

}
