package com.minhthang.databaseconnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.minhthang.model.Person;

public class Test {
	public static void main(String[] args) throws SQLException {
		Connection conn = Database.getConnection();
		Person person = new Person("3", "em iu", "gau cua thang", "www.facecbook.com", "23-11-2018");
		PersonDAO.addNewPerson(person);
		String sql = "select PERSON_NAME from DB.DBA.PERSON" ;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
		System.out.println(rs.getString(1));
		}
	}
}