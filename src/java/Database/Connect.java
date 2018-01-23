/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author S
 */
public class Connect {
    //MySQL
    /*
    public static Connection getConn()
    {
        Connection conn = null;
        try
        {
            Class.forName("conn.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/shoplaptop", "root","mysql");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    /**
    // *
    // * @param args
     
    public static void main(String[] args)
    {
        System.out.println(getConn());
    }
    */
    
    //SQLServer
	public static Connection getConn(){
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=shoplaptop;user=sa;password=123");
			System.out.println("Connect success");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error when you connect to database!Error is: "+e.getMessage());
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println(getConn());
	}
	public  void excuteSql(String sql) throws Exception{
		Connection connect =getConn();
		PreparedStatement stmt =   (PreparedStatement) connect.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet selectData(String sql) throws Exception{
		Connection connect = getConn();
		PreparedStatement stmt =   (PreparedStatement) connect.createStatement();
		ResultSet rs=	stmt.executeQuery(sql);
		return rs;
	}
       
}
