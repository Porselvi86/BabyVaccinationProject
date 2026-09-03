package vaccination;

import java.sql.*;
import java.util.Scanner;

public class SearchBaby {

    public static void searchBaby() throws Exception {

        String url = "jdbc:mysql://localhost:3306/BabyVaccination";
        String userName = "root";
        String password = "Porselvi";

        Connection con = DriverManager.getConnection(url, userName, password);

        Scanner sc = new Scanner(System.in);

        System.out.println("--------- Search Baby ---------");

        System.out.print("Enter Baby ID: ");
        int baby_id = sc.nextInt();

        String query = "SELECT * FROM Baby WHERE baby_id=?";

        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, baby_id);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {

            System.out.println("\nBaby ID      : " + rs.getInt("baby_id"));
            System.out.println("Parent ID    : " + rs.getInt("parent_id"));
            System.out.println("Baby Name    : " + rs.getString("baby_name"));
            System.out.println("Gender       : " + rs.getString("gender"));
            System.out.println("Date of Birth: " + rs.getDate("baby_dob"));
            System.out.println("Blood Group  : " + rs.getString("blood_group"));

        } else {

            System.out.println("Baby ID Not Found");

        }

        rs.close();
        pst.close();
        con.close();
    }

    public static void main(String[] args) throws Exception {

        searchBaby();

    }
}
