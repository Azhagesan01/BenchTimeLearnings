import java.sql.*;
public class JdbcCrudOperations {
	
	static final String DB_URL="jdbc:mysql://localhost:3306/EMP";
	static final String USER="root";
	static final String PASS="1234";
	
	public static void main(String args[])
	{
		Connection conn=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			
			
			        
					
					String SQL="CREATE TABLE Employees " +
				            "(id INTEGER not NULL, " +
				            " age INTEGER not NULL, " + 
				            " name VARCHAR(255), " + 
				            " city VARCHAR(255), " + 
				            " PRIMARY KEY ( id ))"; 
			        stmt.executeUpdate(SQL);
			        
			       String InsertSQL="INSERT INTO Employees"
							+ "(id, age, name, city) VALUES"
							+ "(?,?,?,?)";
			       
			       pstmt=conn.prepareStatement(InsertSQL);
			       
			        pstmt.setInt(1,001);
			        pstmt.setInt(2, 20);
			        pstmt.setString(3, "A");
			        pstmt.setString(4,"Chennai");
			        pstmt.addBatch();
			        
			        pstmt.setInt(1,002);
			        pstmt.setInt(2,21);
			        pstmt.setString(3, "B");
			        pstmt.setString(4, "Delhi");
			        pstmt.addBatch();
			        
			        pstmt.executeBatch();
			        
			        
			        	        
			        SQL="UPDATE Employees SET age=22 WHERE id=002";
			        stmt.executeUpdate(SQL);
			        
			        SQL="DELETE FROM Employees WHERE id=001";
			        stmt.executeUpdate(SQL);
			        
			        
			        
			        printRows(stmt);
			 
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
			stmt.close();
			conn.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
		}
	}
	
	public static void printRows(Statement stmt)
	{
		try
		{
		String sql="SELECT * FROM Employees";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next())
		{
			   int id  = rs.getInt("id");
		      int age = rs.getInt("age");
		      String name = rs.getString("name");
		      String city = rs.getString("city");
		      
		      System.out.print("ID: " + id);
		      System.out.print(", Age: " + age);
		      System.out.print(", Name: " + name);
		      System.out.println(", City: " + city);
		}
		rs.close();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
	
	
	
	