package com.minhthang.databaseconnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.minhthang.model.Person;

public class PersonDAO {
	public static boolean addNewPerson(Person person) throws SQLException {
		Connection conn = Database.getConnection();
		String sql = "insert into DB.DBA.PERSON (PERSON_ID, PERSON_NAME, PERSON_DESCRIPSION, PERSON_LINK, PERSON_DATE) values ("
				+ person.getId() + ", '" + person.getName() + "', '" + person.getDescription() + "', '"
				+ person.getLink() + "', '" + person.getDate() + "' )";
		Statement stmt = Database.getConnection().createStatement();
		int n = stmt.executeUpdate(sql);
		if (n != 0)
			return true;
		return false;
	}
	
	public static boolean updatePerson(Person person) throws SQLException {
		Connection conn = Database.getConnection();
		String sql = "update DB.DBA.PERSON set PERSON_NAME = '" + person.getName() + "', PERSON_DESCRIPSION = " + person.getDescription() +"' where id= "
				+ person.getId();
		Statement stmt = Database.getConnection().createStatement();
		int n = stmt.executeUpdate(sql);
		if (n != 0)
			return true;
		return false;
	}

}
