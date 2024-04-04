package org.jsp.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Credentials {
	@Value(value = "${dbuser.name}")
	private String username;
	@Value(value = "${dbuser.password}")
	private String password;

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
	}

}
