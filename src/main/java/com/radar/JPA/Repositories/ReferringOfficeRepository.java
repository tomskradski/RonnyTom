package com.radar.JPA.Repositories;

import com.radar.JPA.Entities.ReferringOfficeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReferringOfficeRepository extends CrudRepository<ReferringOfficeEntity, Long> {

    List<ReferringOfficeEntity> findReferringOfficeByOfficeName(String officeName);
}
