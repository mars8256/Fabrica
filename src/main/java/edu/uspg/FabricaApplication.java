package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.inter.IShape;

@SpringBootApplication
public class FabricaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabricaApplication.class, args);
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		IShape shape1 = shapeFactory.getShape("POSTGRES");
		IShape shape2 = shapeFactory.getShape("MYSQL");
		IShape shape3 = shapeFactory.getShape("SQLSERVER");
		IShape shape4 = shapeFactory.getShape("ORACLE");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
