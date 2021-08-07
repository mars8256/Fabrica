package edu.uspg.impl;

import edu.uspg.inter.IShape;

public class Rectangulo implements IShape {

	@Override
	public void draw() {
		System.out.println("Adentro de Rectangulo::draw() method.");		
	}

}
