

import java.sql.*;
import java.sql.DatabaseMetaData;

public class Connect
{
/*
	private static String url		=  "jdbc:mysql://localhost:3306/db_l";
	private static String username	=  "root";
	private static String password	=  "Adity@98.321";
	public  static  Connection con			;
	*/
	/*
	public static Connection getConnection()
	{
		return  con;
	}
	
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con  =DriverManager.getConnection(url,  username,password);
			
			// id from user 
			// indexing form 1 
			String query = "SELECT * FROM table_name WHERE password = ? AND email = ?  ";
				PreparedStatement sc = con.prepareStatement(query);
			
			//sc.setString (id, value);
			
			// data manipulation 
			ResultSet rst = sc.executeQuery();
			
			// for data defination 
			boolean done =  sc.execute();
			
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
	}
	*/
	public static void main(String [] args)
	{
		String url		=  "jdbc:mysql://localhost:3306/db_l";
		String username	=  "root";
		String password	=  "Adity@98.321";
				;
			
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  =DriverManager.getConnection(url,  username,password);
			System.out.println("Connected");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
/*

*/

}
