package com.viswa.enumsInJava;

public class EnumWithCustomizedValue {

	public static void main(String[] args) {

		TrafficSignal[] tfs= TrafficSignal.values();
		for (TrafficSignal trafficSignal : tfs) {
			System.out.println(trafficSignal.name()+" "+trafficSignal.toString()+" "+
					trafficSignal.getAction()+" "+trafficSignal.ordinal());
			
		}
		
	}

}
