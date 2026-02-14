package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public Map<Integer, Integer> salesData() {
		Map<Integer, Integer> map = new HashMap();
		map.put(1996, 2000);
		map.put(2001, 2005);
		map.put(2010, 2015);
		map.put(2020, 2024);
		map.put(2020, 45000);
		map.put(2021, 50000);
		map.put(2022, 55000);
		map.put(2023, 60000);
		
		return map;
	}

}
