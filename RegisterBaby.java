package vaccination;
	import java.sql.*;
	import java.util.Scanner;

	public class RegisterBaby {

	    public static void insertBaby() throws Exception {

	        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
	        String userName = "root";
	        String password = "Porselvi";

	        Connection con = DriverManager.getConnection(url, userName, password);

	        Scanner sc = new Scanner(System.in);

	        System.out.println("--------- Baby Registration ---------");

	        System.out.print("Enter Baby ID: ");
	        int baby_id = sc.nextInt();

	        System.out.print("Enter Parent ID: ");
	        int parent_id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Baby Name: ");
	        String baby_name = sc.nextLine();

	        System.out.print("Enter Gender: ");
	        String gender = sc.nextLine();

	        System.out.print("Enter Baby DOB (yyyy-mm-dd): ");
	        String dob = sc.nextLine();

	        System.out.print("Enter Blood Group: ");
	        String blood_group = sc.nextLine();

	        String query = "INSERT INTO Baby VALUES(?,?,?,?,?,?)";

	        PreparedStatement pst = con.prepareStatement(query);

	        pst.setInt(1, baby_id);
	        pst.setInt(2, parent_id);
	        pst.setString(3, baby_name);
	        pst.setString(4, gender);
	        pst.setDate(5, Date.valueOf(dob));
	        pst.setString(6, blood_group);

	        int rows = pst.executeUpdate();

	        System.out.println("Number of rows affected: " + rows);
	        System.out.println("Baby Registered Successfully");

	        pst.close();
	        con.close();
	    }

	    public static void main(String[] args) throws Exception {

	        insertBaby();

	    }
	}

