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
            System.out.println("Welcome "+IUMenu.patienLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
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
            Map<Integer,Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate=0;
            Doctor doctorSelected = new Doctor("","");
            for (Map.Entry<Integer,Doctor> doc:doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            System.out.println(doctorSelected.getName()+" .Date: "+
                            doctorSelected.getAvailableAppointments().get(indexDate).getDate()+
                    " Time: "+
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("confirm your appointment: \n 1.Yes \n 2.Change data");
            response=Integer.valueOf(sc.nextLine());

            if(response==1){
              IUMenu.patienLogged.AddAppointmentDoctors(doctorSelected
              ,doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
              doctorSelected.getAvailableAppointments().get(indexDate).getTime());

              showPatientMenu();
            }

        }while (response!=0);
    }
    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println(":: My appointments");
            if(IUMenu.patienLogged.getAppointmentDoctors().size()==0){
                System.out.println("Dont have Appointment");
                break;
            }
            for (int i = 0; i <IUMenu.patienLogged.getAppointmentDoctors().size() ; i++) {
                  int j = i+1;
                System.out.println(j+". "+
                        IUMenu.patienLogged.getAppointmentDoctors().get(i).getDate()+
                        "Date "+IUMenu.patienLogged.getAppointmentDoctors().get(i).getTime()+
                        "Doctor: "+ IUMenu.patienLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }
            System.out.println("0. return");
        }while (response!=0);
    }
}
