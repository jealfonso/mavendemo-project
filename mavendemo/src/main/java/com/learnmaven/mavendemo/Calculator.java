package com.learnmaven.mavendemo;

public class Calculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public double divide(int num1, int num2) {
		if(num2 == 0) {
			return 0.0;
		}else {
			return num1 / num2;
		}	
	}




}
