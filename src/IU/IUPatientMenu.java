package IU;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IUPatientMenu {
    public static void showPatientMenu(){
        int response =0;
        do {
            System.out.println();
            System.out.println("Patient");
            System.out.println("Welcome "+IUMenu.patienLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
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

    private static void showBookAppointmentMenu(){
        int response=0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("Select date ");
            Map<Integer,Map<Integer,Doctor>> doctors = new TreeMap<>();
            int k =0;
            for (int i = 0; i < IUDoctorMenu.doctorsAvailableAppointments.size() ; i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments=
                        IUDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer,Doctor> doctorAppointment = new TreeMap<>();
                for (int j = 0; j <availableAppointments.size() ; j++) {
                    k++;
                    System.out.println(k+". "+availableAppointments.get(j).getDate());
                    doctorAppointment.put(Integer.valueOf(j), IUDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointment);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

        }while (response!=0);
    }
}
