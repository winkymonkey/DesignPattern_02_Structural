package com.example.designpattern.flyweight;


class CounterTerrorist implements Player {
	private final String task;		// Intrinsic Attribute
	private String weapon;			// Extrinsic Attribute

	public CounterTerrorist() {
		task = "DIFFUSE BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void startMission() {
		System.out.println("CT's Weapon="+weapon+"|Task="+task);
	}
}

