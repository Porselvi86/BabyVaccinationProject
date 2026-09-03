package vaccination;
import java.sql.*; 
public class DbConnections {

	public static void main(String[] args) throws Exception{
	String url = "jdbc:mysql://localhost:3306/BabyVaccination"; 
	String userName = "root"; 
	String password = "Porselvi";  
	Connection con = DriverManager.getConnection(url, userName, password); 

	   System.out.println("Connected to DataBase Successfully"); 
	   
	con.close();
	}
		}
