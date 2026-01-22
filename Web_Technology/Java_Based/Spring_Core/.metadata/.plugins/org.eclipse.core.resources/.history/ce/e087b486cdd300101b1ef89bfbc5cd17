package com.mainapp;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

    private int eid;
    private String ename;
    private Properties properties;
    

    
    

    public Employee() {
        System.out.println("Emp Bean Instantiation");
    }
    
    // ✅ Constructor Injection
    public Employee(int eid, String ename, Properties properties) {
        this.eid = eid;
        this.ename = ename;
        this.properties = properties;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", properties=" + properties + "]";
	}
    
    

}
