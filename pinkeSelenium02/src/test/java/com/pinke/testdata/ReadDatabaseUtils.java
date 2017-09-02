package com.pinke.testdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadDatabaseUtils {
	
	public static void main(String[] args) {
		//String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql:///cloud5?characterEncoding=UTF8&serverTimezone=CST";
		String username = "root";
		String password = "";
		String tableName = "calctestdata";
		Object[][] objs = getDataFromDB(url, username, password, tableName);
		for(int i = 0; i < objs.length; i++) {
			for(int j = 0; j < objs[i].length; j++) {
				System.out.print(objs[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static Object[][] getDataFromDB(String url, 
			String username, String password, String tableName){
		Object[][] objs = null;
		/*try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from "+tableName);
			int cols = rs.getMetaData().getColumnCount();
			List<Object[]> list = new ArrayList<>();
			while(rs.next()) {
				Object[] o = new Object[cols];
				for(int i = 0; i < cols; i++)
					o[i] = rs.getObject(i+1);
				list.add(o);
			}
			int size = list.size();
			objs = new Object[size][];
			for(int i = 0; i < size; i++) {
				objs[i] = list.get(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return objs;
	}
}