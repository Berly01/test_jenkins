package com.berly.database;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL extends DataBase {

	public MySQL() {
		super();
	}
	
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	     
	    String urlDataBase;
	    
	    try {
	    	urlDataBase = DataBase.getUrlDatabase();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	    
        return DriverManager.getConnection(urlDataBase);    
	}
}
