package com;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import com.berly.database.DataBase;
import com.berly.database.MySQL;

public class Initial {

	public static void main(String[] args) {

		MySQL mySQL = new MySQL();
		try {
			Connection connection = mySQL.getConnection();
			System.out.print("Se obtuvo la connecion\n" + DataBase.getUrlDatabase());
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
