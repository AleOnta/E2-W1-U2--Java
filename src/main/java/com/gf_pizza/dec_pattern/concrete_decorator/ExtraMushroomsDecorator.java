package com.gf_pizza.dec_pattern.concrete_decorator;

import com.gf_pizza.dec_pattern.component.Consummation;
import com.gf_pizza.dec_pattern.decorator.ExtraAdditionDecorator;

public class ExtraMushroomsDecorator extends ExtraAdditionDecorator {

	public ExtraMushroomsDecorator(Consummation consumation) {
		this.consumation = consumation;
	}
	
	@Override
	public String getName() {
		return consumation.getName() + "+ mushrooms ";
	}

	@Override
	public double getKcal() {
		return consumation.getKcal() + 350;
	}
	
	@Override
	public double getPrice() {
		return consumation.getPrice() + 1.50;
	}

	public String toString() {
		return "[name=" + this.getName() + ", Price=" + String.format("%.2f", this.getPrice()) + "€ ]";
	}
	
}
