package vaccination;

import java.sql.*;
import java.util.Scanner;

public class RegisterParent {

    public static void insertParent() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
        String userName = "root";
        String password = "Porselvi";

        Connection con = DriverManager.getConnection(url, userName, password);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Parent ID: ");
        int parent_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Parent Name: ");
        String parent_name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile_no = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        String query = "INSERT INTO Parent VALUES(?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, parent_id);
        pst.setString(2, parent_name);
        pst.setString(3, mobile_no);
        pst.setString(4, email);
        pst.setString(5, address);

        int rows = pst.executeUpdate();

        System.out.println("Number of rows affected: " + rows);
        System.out.println("Parent Registered Successfully");

        pst.close();
        con.close();
    }

    public static void main(String[] args) throws Exception {
        insertParent();
    }
}