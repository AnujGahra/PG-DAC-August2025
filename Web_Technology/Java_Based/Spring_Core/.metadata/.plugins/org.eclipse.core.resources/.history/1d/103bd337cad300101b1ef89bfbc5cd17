package com.mainapp;

import java.util.Map;
import java.util.Set;

public class Employee {

    private int eid;
    private String ename;
    private Set<String> listofBooks;
    private Set<Account> accounts;

    // ✅ MAP fields
    private Map<String, String> bookMap;
    private Map<Integer, Account> accountMap;

    public Employee() {
        System.out.println("Emp Bean Instantiation");
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setListofBooks(Set<String> listofBooks) {
        this.listofBooks = listofBooks;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    // ✅ Map setters
    public void setBookMap(Map<String, String> bookMap) {
        this.bookMap = bookMap;
    }

    public void setAccountMap(Map<Integer, Account> accountMap) {
        this.accountMap = accountMap;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid +
                ", ename=" + ename +
                ", listofBooks=" + listofBooks +
                ", accounts=" + accounts +
                ", bookMap=" + bookMap +
                ", accountMap=" + accountMap + "]";
    }
}
