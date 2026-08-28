package vaccination;

import java.sql.*;

public class ViewAppointment {

    public static void viewAppointments() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
        String userName = "root";
        String password = "Porselvi";

        Connection con = DriverManager.getConnection(url, userName, password);

        String query = "SELECT * FROM Appointment";

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        System.out.println("--------- Appointment Details ---------");

        while (rs.next()) {

            System.out.println("Appointment ID   : " + rs.getInt("appointment_id"));
            System.out.println("Parent ID        : " + rs.getInt("parent_id"));
            System.out.println("Vaccine ID       : " + rs.getInt("vacci_id"));
            System.out.println("Appointment Date : " + rs.getDate("appointment_date"));
            System.out.println("Hospital ID      : " + rs.getInt("hospital_id"));
            System.out.println("Status           : " + rs.getString("status"));

            System.out.println("---------------------------------------");
        }

        rs.close();
        stmt.close();
        con.close();
    }

    public static void main(String[] args) throws Exception {

        viewAppointments();

    }
}