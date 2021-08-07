package edu.uspg;

import edu.uspg.impl.Circulo;
import edu.uspg.impl.Cuadrado;
import edu.uspg.impl.Rectangulo;
import edu.uspg.inter.IShape;

public class ShapeFactory {

	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CUADRADO")) {
			return new Cuadrado();
		}else if (shapeType.equalsIgnoreCase("RECTANGULO")) {
			return new Rectangulo();
		}else if (shapeType.equalsIgnoreCase("CIRCULO")) {
			return new Circulo();
		}
		
		return null;
	}
}
