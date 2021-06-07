package com.mrbarin.springcourse.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import javax.inject.Named;

@Named
//In this way you can have different instance of this component that is being called as dependency in person DAO
//Thus, each time we ask for a bean for PersonDAO we have a different instance of JdbcConnection;
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,
		proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {
	
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
