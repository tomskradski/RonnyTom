package com.radar.JPA.Repositories;

import com.radar.JPA.Entities.ReferringOffice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReferringOfficeRepository extends CrudRepository<ReferringOffice, Long> {

    List<ReferringOffice> findReferringOfficeByOfficeName(String officeName);
}
