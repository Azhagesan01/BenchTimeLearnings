import java.sql.*;

public class JDBCFirst
{
	static final String DB_URL="jdbc:mysql://localhost:3306/EMP";
	static final String USER="root";
	static final String PASS="1234";
	Connection conn=null;
	

	public void createConnection(){
		try{
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  conn=DriverManager.getConnection(DB_URL, USER, PASS);
			  if(conn!=null)
			  {
				  System.out.println("Connected to database");
			  }
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
	}
	
	public void closeConnection()
	{
           try
           {
        	   conn.close();
           }
           catch(Exception e )
           {
        	   e.printStackTrace();
           }
	}
	  
public void createOperation()
	{
		
		
		Statement stmt=null;
		try
		{
			stmt=conn.createStatement();
			
			String sql="CREATE TABLE Students " +
            "(id INTEGER not NULL, " +
            " age INTEGER not NULL, " + 
            " name VARCHAR(255), " + 
            " city VARCHAR(255), " + 
            " PRIMARY KEY ( id ))"; 
		   stmt.executeUpdate(sql);
		   
			
		   
		   System.out.println("Table Created");
			
		}
		catch(SQLException se)
		{}
		catch(Exception e) {}
		
			
		
	}
	
	public void InsertOperation()
	{
		 
		   Statement stmt=null;
	   
	   try
	    {
		  stmt=conn.createStatement();
		  
		  
		  String sql="INSERT INTO Students " + "VALUES (001, 21, 'Azhagappan', 'Chennai')";
		  stmt.executeUpdate(sql);
		  
		  
		  sql="INSERT INTO Students " + "VALUES (002, 23, 'Hari', 'Tambaram')";
		   stmt.executeUpdate(sql);
		   
		   sql="INSERT INTO Students " + "VALUES (003, 20, 'Guru', 'Chrompet')";
		  stmt.executeUpdate(sql);
		  
		  /*sql="INSERT INTO Students " + "VALUES (004, 17, 'Shiva', 'Egmore')";
		  stmt.executeUpdate(sql);
		  
		  sql="INSERT INTO Students " + "VALUES (005, 18, 'Ganesh', 'Mount')";
		  stmt.executeUpdate(sql);*/
		  
		  
		 
		  
		  System.out.println("Rows Inserted");
		  
	    }
	   
		
		catch(SQLException se)
		{
		 se.printStackTrace();
		 
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		
	   
				 
	}
	
	public  void readOperation()
	{
		 
		   Statement stmt=null;
	   
	   try
	    {
	      
		  stmt=conn.createStatement();
		  String sql="SELECT * FROM Students";
		  ResultSet rs=stmt.executeQuery(sql);
		  
		  while(rs.next())
		  {
			  int id=rs.getInt("id");
			  int age=rs.getInt("age");
			  String name=rs.getString("name");
			  String city=rs.getString("city");
			  
			  System.out.println("ID : " +id);
			  System.out.println("Age : " +age);
			  System.out.println("Name : " +name);
			  System.out.println("City : " +city);
			  
			  
		  }
		  System.out.println("Selected all values from table");
		  
	    }
		
		catch(SQLException se)
		{
		 se.printStackTrace();
		 
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		 
				 
	}
	
	public void updateOperation()
	{
		 
		   Statement stmt=null;
	   
	   try
	    {
	      
		  stmt=conn.createStatement();
		  
		  
		  String sql="UPDATE Students SET age=30 WHERE id=001";
		  stmt.executeUpdate(sql);
		  
		  System.out.println("Rows Updated");
		  
	    }
	   
		
		catch(SQLException se)
		{
		 se.printStackTrace();
		 
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		 
				 
	}
	
	public  void deleteOperation()
	{
		
		Statement stmt=null;
		
		
		try
		{
			
			stmt=conn.createStatement();
			
			String sql="DELETE FROM Students WHERE id=003";
			stmt.executeUpdate(sql);
			
		System.out.println("Last Row Deleted");
			
			
		}
		catch(SQLException se)
		{}
		catch(Exception e)
		{}
		
	}
	
	

 
	public static void main(String args[])
   {
		
		
	 JDBCFirst j=new JDBCFirst();
	 j.createConnection();
	 j.createOperation();
	 j.InsertOperation();
	 //j.readOperation();
	 j.updateOperation();
	 //j.readOperation();
	 j.deleteOperation();
	 j.readOperation();
	 j.closeConnection();
    }
}