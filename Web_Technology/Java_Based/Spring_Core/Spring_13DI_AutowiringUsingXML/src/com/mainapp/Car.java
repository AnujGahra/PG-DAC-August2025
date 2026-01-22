package com.mainapp;

public class Car {

	private int cn;
	private String carName;
	
	
	public Car() {
		
	}


	public Car(int cn, String carName) {
		super();
		this.cn = cn;
		this.carName = carName;
	}


	public int getCn() {
		return cn;
	}


	public void setCn(int cn) {
		this.cn = cn;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	@Override
	public String toString() {
		return "Car [cn=" + cn + ", carName=" + carName + "]";
	}
	
	
}
