package com.nextlearn.portfolio.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class GlobalExceptionHandler {
		
	
	@ExceptionHandler(Exception.class)
	public String handleGeneralException(Exception e, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		
		String header = httpServletRequest.getHeader("referer");
		System.out.println(header);
		
		redirectAttributes.addFlashAttribute("result", "Something went wrong");
		
		return "redirect:"+ header;
	}
	
	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public String handleMaxUploadSizeExceededException(Exception e, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		
		String header = httpServletRequest.getHeader("referer");
		System.out.println(header);
		
		redirectAttributes.addFlashAttribute("result", "File size must not exceed 5MB");
		
		return "redirect:"+ header;
	}
	
	
}
