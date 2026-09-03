package vaccination;

import java.sql.*;
import java.util.Scanner;

public class UpdateAppointment {

    public static void updateAppointment() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
        String userName = "root";
        String password = "Porselvi";

        Connection con = DriverManager.getConnection(url, userName, password);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Appointment ID: ");
        int appointment_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Status: ");
        String status = sc.nextLine();

        String query = "UPDATE Appointment SET status=? WHERE appointment_id=?";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setString(1, status);
        pst.setInt(2, appointment_id);

        int rows = pst.executeUpdate();

        System.out.println("Number of rows affected: " + rows);

        if (rows > 0) {
            System.out.println("Appointment Updated Successfully");
        } else {
            System.out.println("Appointment ID Not Found");
        }

        pst.close();
        con.close();
    }
}