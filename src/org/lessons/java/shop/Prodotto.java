package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int code;
	private String name;
	private String description;
	private double iva;
	
	public Prodotto(String name, String description, double iva) {
		setCode(code);
		setName(name);
		setDescription(description);
		setIva(iva);
		
	}
	
	public int getCode() {
		return this.code;
	}
	
	private void setCode(int code) {
		Random rnd = new Random();
		this.code = rnd.nextInt(0,2147483647);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public double getIva() {
		return this.iva;
	}
	
	@Override
	
	public String toString() {
		return "Product:\n"
				+ "code: " + getCode() + "\n"
				+ "name: " + getName() + "\n"
				+ "desc: " + getDescription()+ "\n"
				+ "iva: " + getIva()+ "%\n";
		
	}
	
	
	
}
