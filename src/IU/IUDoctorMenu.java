package IU;

import java.time.Year;
import java.util.Scanner;

public class IUDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("Welcome"+ IUMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    IUMenu.showMenu();
                    break;
            }

        }while (response!=0);
    }

    private static void showAddAvailableAppointmentsMenu(){
         int response =0;
         do {
             System.out.println();
             System.out.println("Add Avalable appointments");
             System.out.println("Select a month");

             for (int i = 0; i < 3; i++) {
                 int j= i+1;
                 System.out.println(j+". "+IUMenu.MONTHS[i]);
             }
             System.out.println("0. Return");
             Scanner sc = new Scanner(System.in);
             response = Integer.valueOf(sc.nextLine());

             if (response>0 && response<4){
                 int monthSelected = response;
                 System.out.println(monthSelected+" . "+IUMenu.MONTHS[monthSelected]);
                 System.out.println("Inser day Available {dd/mm/yyyy}");
                 String date=sc.nextLine();
                 System.out.println("your date is "+date+"1.Correct \n 2. change date");

             } else if (response==0) {
                 showDoctorMenu();
             }

         } while (response!=0);
    }
}
