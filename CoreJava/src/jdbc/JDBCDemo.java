package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class DBOperations{
	
	String url,username, password;
	Connection connection;
		
	public DBOperations()
	{
		//url varies from database to database (ref: slides)
		url = "jdbc:mysql://localhost/ram_test";
		username = "root";
		password = "";
		
		//Load the JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create the connection
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connection Opened");
	}
	
	void closeDBOperations()
	{
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection closed");
	}
	
	void insertIntoDB(int id, int rollNum, String name, String address)
	{
		try{
			
			//the below 3 statements are also good, but need framing the SQL statement carefully
			/*
			String sql = "insert into student values("+id+","+rollNum+",'"+name+"','"+address+"')";
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(sql);
			*/
			
			String sql = "insert into student values(?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, id);
			statement.setInt(2, rollNum);
			statement.setString(3, name);
			statement.setString(4, address);
			
			int i = statement.executeUpdate();
			System.out.println("Record Inserted: "+i);
			
		}catch (SQLException sql){
			sql.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}		
	}
	
	void queryFromDB()
	{
		try{
			
			String sql = "select * from student order by id DESC";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet rs = statement.executeQuery();
			
			System.out.println("Reading records from the DB...");
			int id=0, rollNum=0;
			String name="", address="";
			while(rs.next())
			{
				id = rs.getInt(1);
				rollNum = rs.getInt(2);
				name = rs.getString(3);
				address = rs.getString(4);
				
				System.out.println("id = "+id+"; rollNum = "+rollNum+"; name = "+name+"; address = "+address);
			}
			
		}catch (SQLException sql){
			sql.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	void updateIntoDB(String address, int rollNum)
	{
		try{
		
			String sql = "update student set address = ? where rollNum = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, address);
			statement.setInt(2, rollNum);
			
			int i = statement.executeUpdate();
			
			System.out.println("Record updated: "+i);
					
		}catch (SQLException sql){
			sql.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	void deleteFromDB()
	{
		try{
		
			String sql = "delete from student where rollNum = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Roll Num to delete");
			int rollNum = scanner.nextInt();
			statement.setInt(1, rollNum);			
			int i = statement.executeUpdate();
			System.out.println("Record deleted: "+i);
			scanner.close();
					
		}catch (SQLException sql){
			sql.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	void invokeStoredProcedure()
	{
		try{
			
			String call = "{call insertStudent(?,?,?,?)}";
			CallableStatement cs = connection.prepareCall(call);
			
			cs.setInt(1, 90);
			cs.setInt(2, 14);
			cs.setString(3, "Steve");
			cs.setString(4, "Nebraska");
			
			boolean executed = cs.execute();
			if (executed)
			{
				System.out.println("Stored Procedure executed");
			}
			
			}catch (SQLException sql){
				sql.printStackTrace();
			}catch (Exception e){
				e.printStackTrace();
		}
	}
}

//Make sure the MYSql DB is up and running before running this program
public class JDBCDemo {

	public static void main(String[] args) {
	
		//create connection (see constructor above)
		DBOperations dbRef = new DBOperations();
		//insert record
		//dbRef.insertIntoDB(86, 58, "Mike", "Connecticut");
		//query from DB
		//dbRef.queryFromDB();
		//System.out.println("-------------------------------------");
		//System.out.println("Updating the record for Roll num = 45");
		//update a record
		//dbRef.updateIntoDB("South Carolina", 45);
		//System.out.println("-------------------------------------");
		//dbRef.queryFromDB();
		//delete a record
		//dbRef.deleteFromDB();
		//dbRef.queryFromDB();
		dbRef.invokeStoredProcedure();
		//close connection
		dbRef.closeDBOperations();		
	}
}
