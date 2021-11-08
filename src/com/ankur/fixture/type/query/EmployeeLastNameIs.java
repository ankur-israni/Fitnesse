package com.ankur.fixture.type.query;

import java.util.List;

public class EmployeeLastNameIs {
	private String lastName;

	public EmployeeLastNameIs(String firstName) {
		this.lastName = firstName;
	}

	public void table(List<List<String>> table) {
		System.out.println("THIS IS THE TABLE METHOD");
	}

	public List<Object> query() {
		return  QueryFixtureObjectMother.getQueryFixtureData();
	}
}