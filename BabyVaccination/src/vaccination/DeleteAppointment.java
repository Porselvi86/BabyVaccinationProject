package vaccination;

import java.sql.*;
import java.util.Scanner;

public class DeleteAppointment {

    public static void deleteAppointment() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
        String userName = "root";
        String password = "Porselvi";

        Connection con = DriverManager.getConnection(url, userName, password);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Appointment ID to Delete: ");
        int appointment_id = sc.nextInt();

        String query = "DELETE FROM Appointment WHERE appointment_id=?";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, appointment_id);

        int rows = pst.executeUpdate();

        System.out.println("Number of rows affected: " + rows);

        if (rows > 0) {
            System.out.println("Appointment Deleted Successfully");
        } else {
            System.out.println("Appointment ID Not Found");
        }

        pst.close();
        con.close();
 
    }
}