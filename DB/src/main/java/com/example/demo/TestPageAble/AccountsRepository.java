package com.example.demo.TestPageAble;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<AccountsEntity, Integer> {

    Page<AccountsEntity> findByAccountIdIgnoreCase(String id, Pageable p);
}
