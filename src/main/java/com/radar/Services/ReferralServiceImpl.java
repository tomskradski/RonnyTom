package com.radar.Services;

import com.radar.JPA.Entities.ReferralEntity;
import com.radar.JPA.Repositories.ReferralRepository;
import com.radar.Models.Referral;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ReferralServiceImpl implements ReferralService {

    @Autowired
    ReferralRepository referralRepository;

    public Boolean processNewReferral(Referral referral) {

        // try to save referral to DB
        ModelMapper modelMapper = new ModelMapper();
        ReferralEntity referralEntity = modelMapper.map(referral, ReferralEntity.class);

        try {
            referralRepository.save(referralEntity);
        }
        catch (Exception e){
            return false;
        }

        // build email contents

        // send email

        return true;
    }
}
