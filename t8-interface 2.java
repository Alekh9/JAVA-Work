package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		Remote remote = new Television();
		remote.powerOn();
		remote.volumeUp();
		remote.powerOff();
	}
}

interface Remote {

	void volumeUp();
	void volumeDown();
	void powerOff();
	void powerOn();
}

class Television implements Remote {

	@Override
	public void volumeUp() {
		System.out.println("Volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Volume down");
	}

	@Override
	public void powerOff() {
		System.out.println("Power Off");
	}

	@Override
	public void powerOn() {
		System.out.println("Power On");
	}
}
