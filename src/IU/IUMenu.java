package IU;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class IUMenu {

    public static final String[] MONTHS ={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patienLogged;


    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("model.Doctor");
                    authUser(1);
                    response=0;
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    private static void authUser(int userType){
        ArrayList<Doctor> doctors= new ArrayList<>();
        doctors.add(new Doctor("Pepito Perez", "PP@mail.com"));
        doctors.add(new Doctor("Juanita junin", "JJ@mail.com"));
        doctors.add(new Doctor("Menganito Martinez", "MM@mail.com"));

        ArrayList<Patient> patients= new ArrayList<>();
        patients.add(new Patient("Paciente Generico1","generico@mail.com"));
        patients.add(new Patient("Paciente inventado2","inventado@mail.com"));
        patients.add(new Patient("Paciente Impaciente3","impaciente@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("insert your email");
            Scanner sc = new Scanner(System.in);
            String email =sc.nextLine();
            if(userType==1){
                for (Doctor d:doctors) {
                    if(d.getEmail().equals(email)){
                        emailCorrect=true;
                        doctorLogged=d;
                        IUDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if(userType==2){
                for (Patient p:patients) {
                    if(p.getEmail().equals(email)){
                        emailCorrect=true;
                        patienLogged=p;
                        IUPatientMenu.showPatientMenu();
                    }
                }
            }
        }while (!emailCorrect);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i+1+". "+MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
