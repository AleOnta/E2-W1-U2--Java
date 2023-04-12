package com.gf_pizza.dec_pattern.concrete_component;

import com.gf_pizza.dec_pattern.component.Consummation;

public class ConcretePizza extends Consummation {
	
	public ConcretePizza() {
		name = "Pizza ";
	}
	
	@Override
	public double getKcal() {
		return 700;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 6.50;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", kcal=" + this.getKcal() + ", Price=" + String.format("%.2f", this.getPrice()) + "€ ]";
	}

	
}
