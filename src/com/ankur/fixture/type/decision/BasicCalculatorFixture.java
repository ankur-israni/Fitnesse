package com.ankur.fixture.type.decision;

import java.util.List;

import org.apache.log4j.Logger;

public class BasicCalculatorFixture {

	private static final Logger log = Logger
			.getLogger(BasicCalculatorFixture.class.getName());

	public Float first, second;




	public BasicCalculatorFixture() {
			log.debug("BasicCalculatorFixture()");
	}

	public Float add() {
		log.debug("add()");
		return first + second;
	}
	
	public void table(List<List<Object>> obj){
		log.debug("table(): obj:"+obj);
	}
	
	public void execute(){
		log.debug("BasicCalculatorFixture.execute()");
	}
	
	public void beginTable(){
		log.debug("BasicCalculatorFixture.beginTable");
	}
	
	public void reset(){
		log.debug("BasicCalculatorFixture.reset()");
	}
	
	public void endTable(){
		log.debug("BasicCalculatorFixture.endTable()");
	}

	public Float sub() {
		log.debug("sub");
		return first - second;
	}

	public Float multiply() {
		return first * second;
	}

	public Float divide() {
		return first / second;
	}

	public Float getFirst() {
		log.debug("getFirst()");
		return first;
	}

	public void setFirst(Float first) {
		log.debug("setFirst");
		this.first = first;
	}

	public Float getSecond() {
		log.debug("getSecond()");
		return second;
	}

	public void setSecond(Float second) {
		log.debug("setSecond()");
		this.second = second;
	}
	
	

}
