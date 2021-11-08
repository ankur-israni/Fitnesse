package com.ankur.fixture.type.query;

import java.util.List;

public class EmployeeFirstNameIs {
	private String firstName;

	public EmployeeFirstNameIs(String firstName) {
		this.firstName = firstName;
	}

	public void table(List<List<String>> table) {
		// optional function
	}

	public List<Object> query() {
		return  QueryFixtureObjectMother.getQueryFixtureData();
	}
}