package com.example.designpattern.bridge;


public abstract class Shape {
	protected Color color;				// Composition - implementor
	public Shape(Color c) {				// constructor with implementor as input argument
		this.color = c;
	}
	
	abstract public void createShape();
}

