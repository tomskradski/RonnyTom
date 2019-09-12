package com.radar.JPA.Repositories;

import com.radar.JPA.Entities.ReferralEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReferralRepository extends CrudRepository<ReferralEntity, Long> {
}
