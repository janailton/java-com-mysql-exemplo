package dbMySQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.*;

public class db {
	
	private String m_url = "jdbc:mysql://127.0.0.1:3306/";
	private String m_dbname = "db_cinema_app";
	private String m_username = "root";
	private String m_password = "";
	
	private static Connection conn= null;
	
	public Connection getConnection() {
		return conn;
	}
	
	
	public db( String url,String dbname, String username, String password) {
		
		m_url = url;
		m_dbname = dbname;
		m_username = username;
		m_password = password;
		
		
		try {
		    conn =  DriverManager.getConnection(m_url + m_dbname + "?user=" + m_username + "&password=" + m_password 
				    		   + "&useLegacyDatetimeCode=false&serverTimezone=America/New_York");
		    
		    if (conn != null)  System.out.println("Connection to MySQL created with sucess!");


		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());	
		}
		
	}
	
	public db() {
			
		try {
		    conn =
		       DriverManager.getConnection(m_url + m_dbname + "?user=" + m_username + "&password=" + m_password 
		    		   + "&useLegacyDatetimeCode=false&serverTimezone=America/New_York");
		    
		    if (conn != null) { System.out.println("Connection to MySQL created with sucess!");}


		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		
	}

}
