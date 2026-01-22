package com.mainapp;



public class Student {
	
	
	private String url;
	private String countryCode;
	private int roll;

	public Student() {
		System.out.println("EMP Bean Instantiation");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	

	public void setRoll(int roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [url=" + url + ", countryCode=" + countryCode + ", roll=" + roll + "]";
	}

	
}
