package com.radar.JPA.Repositories;

import com.radar.JPA.Entities.ReferredOfficeEntity;
import com.radar.JPA.Entities.ReferringOfficeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReferredOfficeRepository extends CrudRepository<ReferredOfficeEntity, Long> {

    List<ReferringOfficeEntity> findReferredOfficeByOfficeName(String officeName);
}
