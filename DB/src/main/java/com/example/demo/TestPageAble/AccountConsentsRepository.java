package com.example.demo.TestPageAble;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountConsentsRepository extends JpaRepository<AccountConsentsEntity, Long> {
    AccountConsentsEntity findByConsentId(String consentId);

    Page<AccountConsentsEntity> findByPsuId(String psuId, Pageable pageable);

    Page<AccountConsentsEntity> findByEntityId(String id, Pageable p);

}
