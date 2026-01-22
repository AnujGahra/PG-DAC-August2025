package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee  {
	
	private String url;
	private String countryCode;
	private int eid;

	public Employee() {
		System.out.println("EMP Bean Instantiation");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [url=" + url + ", countryCode=" + countryCode + ", eid=" + eid + "]";
	}
	
	



    
}
