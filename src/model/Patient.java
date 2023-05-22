package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthDay;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors=new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void AddAppointmentDoctors(Doctor doctor,Date date, String time) {
        AppointmentDoctor appointmentDoctor= new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedulable(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email){
        super(name, email);
    }


    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getWeight() {
        return this.weight+ " kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String  getHeight() {
        return this.height +" Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() +"\nAge: "+birthDay+"\nWeight: "+getWeight()+"\n Height: "+ getHeight()+"\nBlood: "+blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Es Paciente");
    }
}
