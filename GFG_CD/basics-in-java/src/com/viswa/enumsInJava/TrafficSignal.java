package com.viswa.enumsInJava;

public enum TrafficSignal {
  RED("STOP"),GREEN("GO"),ORANGE("SLOW DOWN");
	
	private String action;
	
	public String getAction() {
		return this.action;
	}
	
	private TrafficSignal(String action) {
		this.action=action;
	}
}
