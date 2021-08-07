package edu.uspg.impl;

import edu.uspg.inter.IShape;

public class Cuadrado implements IShape {

	@Override
	public void draw() {
		System.out.println("Adentro de Cuadrado::draw() method.");		
	}

}
