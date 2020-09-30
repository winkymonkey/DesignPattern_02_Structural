package com.example.designpattern.bridge;


public class Triangle extends Shape {
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void createShape() {
		System.out.print("Triangle");
		color.applyColor();
	}
}

