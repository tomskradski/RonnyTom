package com.llc.radar.JPA.Repositories;

import com.llc.radar.JPA.Entities.UserAccount;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Skradski on 6/20/2019.
 */
public interface UserAccountRepository extends CrudRepository<UserAccount, Long>{

    List<UserAccount> findByUserName(String userName);
}
