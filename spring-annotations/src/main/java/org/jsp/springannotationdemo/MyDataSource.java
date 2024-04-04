package org.jsp.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	@Value(value = "${MyDataSource.username}")
	private String username;
	@Value(value = "${MyDataSource.password}")
	private String password;
	@Value(value = "${MyDataSource.url}")
	private String url;
	@Value(value = "${MyDataSource.driverClassName}")
	private String driverClassName;
	@Value(value = "${MyDataSource.mappingResource}")
	private String mappingResource;
	@Value(value = "${MyDataSource.hbm2ddl_auto}")
	private String hbm2ddl_auto;
	@Value(value = "${MyDataSource.dialect}")
	private String dialect;
	@Value(value = "${MyDataSource.formate_sql}")
	private String formate_sql;
	@Value(value = "${MyDataSource.shwo_sql}")
	private String show_sql;

	@Override
	public String toString() {
		return "MyDataSource [username=" + username + ", password=" + password + ", url=" + url + ", driverClassName="
				+ driverClassName + ", mappingResource=" + mappingResource + ", hbm2ddl_auto=" + hbm2ddl_auto
				+ ", dialect=" + dialect + ", formate_sql=" + formate_sql + ", show_sql=" + show_sql + "]";
	}

}
