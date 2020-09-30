package com.example.designpattern.adapter;


public class Adapter implements Dog {
	Bird bird;
	Adapter(Bird bird) {
		this.bird = bird;
	}
	
	public void bark() {
		System.out.print("I am a Dog who is---");
		bird.chirp();
	}
}

