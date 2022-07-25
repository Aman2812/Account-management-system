package com.springres.springres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int accountNo;

    @Column
    private String customerId;

    @Column
    private long currentBalance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Account(int accountNo, String customerId, long currentBalance) {
        this.accountNo = accountNo;
        this.customerId = customerId;
        this.currentBalance = currentBalance;
    }

    public Account() {
    }
}
