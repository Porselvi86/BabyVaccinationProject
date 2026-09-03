package vaccination;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("   BABY VACCINATION MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Register Parent");
            System.out.println("2. Register Baby");
            System.out.println("3. Book Vaccination");
            System.out.println("4. View Appointments");
            System.out.println("5. Update Appointment");
            System.out.println("6. Delete Appointment");
            System.out.println("7. Search Baby");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                RegisterParent.insertParent();
                break;

            case 2:
                RegisterBaby.insertBaby();
                break;

            case 3:
                BookVaccination.bookAppointment();
                break;

            case 4:
                ViewAppointment.viewAppointments();
                break;

            case 5:
                UpdateAppointment.updateAppointment();
                break;

            case 6:
                DeleteAppointment.deleteAppointment();
                break;
                
            case 7:
                SearchBaby.searchBaby();
                break;
                
           
            case 8:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        sc.close();
    }
}