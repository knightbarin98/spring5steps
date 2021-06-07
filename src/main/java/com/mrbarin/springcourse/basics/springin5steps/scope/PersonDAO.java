package com.mrbarin.springcourse.basics.springin5steps.scope;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PersonDAO {
	
	@Inject
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
