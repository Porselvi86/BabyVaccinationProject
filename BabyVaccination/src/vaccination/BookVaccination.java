package vaccination;

import java.sql.*;
import java.util.Scanner;

public class BookVaccination {

    public static void bookAppointment() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
        String userName = "root";
        String password = "Porselvi";

        Connection con = DriverManager.getConnection(url, userName, password);

        Scanner sc = new Scanner(System.in);

        System.out.println("--------- Book Vaccination ---------");

        System.out.print("Enter Appointment ID: ");
        int appointment_id = sc.nextInt();

        System.out.print("Enter Parent ID: ");
        int parent_id = sc.nextInt();

        System.out.print("Enter Vaccine ID: ");
        int vacci_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Appointment Date (yyyy-mm-dd): ");
        String appointment_date = sc.nextLine();

        System.out.print("Enter Hospital ID: ");
        int hospital_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        String query = "INSERT INTO Appointment VALUES(?,?,?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, appointment_id);
        pst.setInt(2, parent_id);
        pst.setInt(3, vacci_id);
        pst.setDate(4, Date.valueOf(appointment_date));
        pst.setInt(5, hospital_id);
        pst.setString(6, status);

        int rows = pst.executeUpdate();

        System.out.println("Number of rows affected: " + rows);
        System.out.println("Vaccination Appointment Booked Successfully");

        pst.close();
        con.close();
    }

    public static void main(String[] args) throws Exception {

        bookAppointment();

    }
}