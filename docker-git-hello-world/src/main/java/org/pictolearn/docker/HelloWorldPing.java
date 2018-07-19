package org.pictolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 320; i++){
			System.out.println("VAI CORINTHIANS!! ("+i+")");
			Thread.sleep(1000);
		}
	}
}
