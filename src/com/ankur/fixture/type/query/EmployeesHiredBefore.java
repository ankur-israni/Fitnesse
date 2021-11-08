package com.ankur.fixture.type.query;

import java.util.Date;
import java.util.List;

public class EmployeesHiredBefore {
	private Date date;

	public EmployeesHiredBefore(Date date) {
		this.date = date;
	}

	public void table(List<List<String>> table) {
		// optional function
	}

	public List<Object> query(){
			return  QueryFixtureObjectMother.getQueryFixtureData();
	}
}