package com.berly.database;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class MySQLTest {

	@Test
	void testGetConnection()  {		
		String url = null;
		try {
			url = DataBase.getUrlDatabase();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		assertNotNull(url);
	}

	@Test
	void testGetUrlDatabase() {	
		MySQL connection = new MySQL();
		try {
			assertNotNull(connection.getConnection());
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
