package com.udemy.memory_management.escaping_references;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
		
	public Double convert(String toCurrency) {
		return value * (rates.get(toCurrency)* rates.get("USD")); 
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	public Map<String,Double> getRates() {
		return new HashMap<>(rates);
//		return Map.copyOf(rates);
//		return Collections.unmodifiableMap(rates);
	}
	
}
