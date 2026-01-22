package com.mainapp;



public class Manager {
	
	
	private String url;
	private String countryCode;
	private int mid;

	public Manager() {
		System.out.println("EMP Bean Instantiation");
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Override
	public String toString() {
		return "Manager [url=" + url + ", countryCode=" + countryCode + ", mid=" + mid + "]";
	}

}
