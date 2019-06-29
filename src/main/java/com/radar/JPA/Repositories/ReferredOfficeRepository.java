package com.radar.JPA.Repositories;

import com.radar.JPA.Entities.ReferredOffice;
import com.radar.JPA.Entities.ReferringOffice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReferredOfficeRepository extends CrudRepository<ReferredOffice, Long> {

    List<ReferringOffice> findReferredOfficeByOfficeName(String officeName);
}
