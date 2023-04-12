package com.gf_pizza.dec_pattern.component;

import lombok.Getter;

public abstract class Consummation {
	@Getter
	protected String name = "";
	@Getter
	protected double kcal = 0;
	
	public abstract double getPrice();
	
	
}
