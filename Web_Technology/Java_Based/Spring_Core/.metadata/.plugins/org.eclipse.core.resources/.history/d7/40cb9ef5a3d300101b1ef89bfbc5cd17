package com.mainapp;

import java.util.Set;

public class Employee {

    private int eid;
    private String ename;
    private Set<String> listofBooks;
    private Set<Account> accounts;   // ✅ Account SET

    public Employee() {
        System.out.println("Emp Bean Instantiation");
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public Set<String> getListofBooks() {
        return listofBooks;
    }

    public void setListofBooks(Set<String> listofBooks) {
        this.listofBooks = listofBooks;
    }

    // ✅ Account setters/getters
    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid +
                ", ename=" + ename +
                ", listofBooks=" + listofBooks +
                ", accounts=" + accounts + "]";
    }
}
