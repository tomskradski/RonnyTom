package com.radar.Services;


import com.radar.Models.Referral;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface ReferralService {

    Boolean processNewReferral(Referral referral);
}
