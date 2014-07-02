package com.ensa.ged.dao;

import java.sql.*;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class DataBaseConnection {
	private static final Logger logger = (Logger) LoggerFactory
			.getLogger(DataBaseConnection.class);

	Connection conn;
	Statement st;
	ResultSet rs;

	public DataBaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/gestionBudgetaire";
			conn = DriverManager.getConnection(url, "root", "agadir");
			st = conn.createStatement();
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IllegalAccessException ex) {
			System.out.println(ex.getMessage());
		} catch (InstantiationException ex) {
			System.out.println(ex.getMessage());
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public ResultSet getSelection(String sql) {
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException ex) {
			logger.fatal(ex.getMessage());
		}
		return rs;
	}

	public int getNumberOfRecords(String sql) {
		rs = getSelection(sql);
		int i = 0;
		try {
			while (rs.next())
				i++;
		} catch (SQLException ex) {
			logger.fatal(ex.getMessage());
		}
		return i;
	}

	public void execute(String sql) {
		try {
			st.executeUpdate(sql);
			// conn.commit();
		} catch (SQLException ex) {
			logger.fatal(ex.getMessage());
		}
	}
}