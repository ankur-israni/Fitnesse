package com.ankur.fixture.type.script;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.Precision;


public class ScriptFixture {

	private List<String> transactions=new ArrayList<>();
	
	public Double balance(){
		Double balance=0.0;
		for(String transaction:transactions){
			balance+=new Double(transaction);
		}
		return Precision.round(balance, 2);
	}
	
	public boolean isUserLoggedIn(){
		return true;
	}
	
	public boolean isUserLoggedOut(){
		return !isUserLoggedIn();
	}

	public List<String> deposits(){
		return transactions;
	}

	public void resetCash(){
		transactions.clear();
	}

	public void deposit(Double payment){
		transactions.add(payment.toString());
	}
	
	public void withdraw(Double amount){
		deposit(-amount);
	}
	
	
	public static void main(String args[]){
		ScriptFixture fixture=new ScriptFixture();
		System.out.println(fixture.balance());
		
		fixture.deposit(10.2);
		fixture.deposit(10.2);
		System.out.println(fixture.transactions);
		System.out.println(fixture.balance());
		fixture.withdraw(12.0);
		System.out.println(fixture.balance());
		
	}
	
}
