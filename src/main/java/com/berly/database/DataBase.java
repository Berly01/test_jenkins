package com.berly.database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.FileInputStream;

public abstract class DataBase  {

	protected DataBase() {}

    public static String getUrlDatabase() throws FileNotFoundException {
    	Properties prop = new Properties();
    	String url = null;
    	try (InputStream input = new FileInputStream("D:\\Ciencia de la Computacion\\Semestre 6\\Ingenieria de Software 2\\test\\config.properties")) { 		
    	    prop.load(input);
    	    String dbUrl = prop.getProperty("db.url");
    	    String user = prop.getProperty("db.user");
    	    String password = prop.getProperty("db.password");
    	    url = String.format("%s&user=%s&password=%s",dbUrl, user, password);
           
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    	
    	return url;
    }
    
    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
    
}
