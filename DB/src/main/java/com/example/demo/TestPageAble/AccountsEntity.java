package com.example.demo.TestPageAble;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "obie_account_allowed")
public class AccountsEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "account_id")
    private String accountId;
    @Column(name = "allowed_accounts")
    private String allowedAccounts;
    @Column(name = "last_access_date")
    private String lastAccessDate;

    public AccountsEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAllowedAccounts() {
        return allowedAccounts;
    }

    public void setAllowedAccounts(String allowedAccounts) {
        this.allowedAccounts = allowedAccounts;
    }

    public String getLastAccessDate() {
        return lastAccessDate;
    }

    public void setLastAccessDate(String lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }
}
