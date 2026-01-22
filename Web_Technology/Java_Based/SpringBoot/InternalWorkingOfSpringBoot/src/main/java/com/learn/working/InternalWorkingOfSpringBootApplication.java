package com.learn.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}
	
//	private RazorpayPaymentService paymentService = new RazorpayPaymentService();
	
	
	@Autowired
//	private RazorpayPaymentService paymentService;
	
	
	private final PaymentService paymentService;
	
	
	

	public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {
	super();
	this.paymentService = paymentService;
}


//@Autowired
//	public void setPaymentService(RazorpayPaymentService paymentService) {
//		this.paymentService = paymentService;
//	}





	@Override
	public void run(String... args) throws Exception {
		String payment = paymentService.pay();	
		System.out.println(payment);
	}

}
