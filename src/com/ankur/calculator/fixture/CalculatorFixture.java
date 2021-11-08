package com.ankur.calculator.fixture;

public class CalculatorFixture {

	private float first, second;

	public CalculatorFixture() {

	}

	public float add() {
		return first + second;
	}
	
	public float divide() {
		return first/second;
	}
	
	public float multiply() {
		return first*second;
	}
	
	public float substract() {
		return first-second;
	}

	public float getFirst() {
		return first;
	}

	public void setFirst(float first) {
		this.first = first;
	}

	public float getSecond() {
		return second;
	}

	public void setSecond(float second) {
		this.second = second;
	}
	
	
	
	
}
