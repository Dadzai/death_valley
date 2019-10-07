package com.deathvalley.first.model;

import java.util.List;

public class User {
    private int user_id;
    private String name;
    private String sur_name;

    private List<Account> accounts;

    public User(int user_id, String name, String sur_name, List<Account> accounts) {
        this.user_id = user_id;
        this.name = name;
        this.sur_name = sur_name;
        this.accounts = accounts;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return sur_name;
    }

    public void setSurName(String sur_name) {
        this.sur_name = sur_name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccaunts(List<Account> accaunts) {
        this.accounts = accaunts;
    }
}
