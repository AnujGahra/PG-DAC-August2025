package com.mainapp;

import com.controller.Controller;
import com.service.MegaService;
import com.service.Service;

public class Launch {
	
	public static void main(String[] args) {
		
		Controller controller = new Controller(new MegaService());
		controller.doGet();
		controller.doGet();
		controller.doGet();
		
	}

}
