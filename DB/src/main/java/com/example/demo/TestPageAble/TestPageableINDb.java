package com.example.demo.TestPageAble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPageableINDb {

    @Autowired
    private AccountConsentsRepository accountConsentsRepository;

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping
    public String pageableTest() {

        PageRequest p = PageRequest.of(0, 20);
//        Page<AccountConsentsEntity> accountConsentsEntity = accountConsentsRepository.findByPsuId("karthikeyan@psu1", p);
//        Page<AccountConsentsEntity> list = accountConsentsRepository.findByEntityId("UKOBI", p);
        Page<AccountsEntity> list = accountsRepository.findByAccountIdIgnoreCase("KARTHIK", p);
        System.out.println(list.getContent().get(0).getAccountId());
        return "success";
    }
}
