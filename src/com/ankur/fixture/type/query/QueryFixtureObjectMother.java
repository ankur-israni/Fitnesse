package com.ankur.fixture.type.query;

import java.util.List;

public class QueryFixtureObjectMother {
	
	
	public static List<Object> getQueryFixtureData() {
		return  ListUtility.list(
					ListUtility.list(
						ListUtility.list("employee number", "1429"),
						ListUtility.list("first name", "Bob"),
						ListUtility.list("last name", "Martin"),
						ListUtility.list("hire date", "10-Oct-1974")
									), 
					ListUtility.list(
						ListUtility.list("employee number", "1567"),
						ListUtility.list("first name", "Bob"),
						ListUtility.list("last name", "Harrold"),
						ListUtility.list("hire date", "10-April-1991")
									),
					ListUtility.list(
						ListUtility.list("employee number", "1788"),
						ListUtility.list("first name", "Peter"),
						ListUtility.list("last name", "Jackson"),
						ListUtility.list("hire date", "5-Jan-2000")
									),
					ListUtility.list(
						ListUtility.list("employee number", "7765"),
						ListUtility.list("first name", "Bob"),
						ListUtility.list("last name", "Jackson"),
						ListUtility.list("hire date", "21-Feb-1969")
									), 
					ListUtility.list(
						ListUtility.list("employee number", "8832"),
						ListUtility.list("first name", "James"),
						ListUtility.list("last name", "Grenning"),
						ListUtility.list("hire date", "15-Dec-1975")
									)
								);
	}

}
