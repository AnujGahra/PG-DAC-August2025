package com.mainapp;

import java.util.UUID;

public class Employee {

    private String id;
    private Account account;

    public Employee() {
        System.out.println("EMP Bean Instantiated....");
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Employee getObject() {
        Employee emp = new Employee();
        emp.setId(UUID.randomUUID().toString());
        return emp;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", account=" + account + "]";
    }
}
