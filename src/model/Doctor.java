package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    int id;

    private String speciality;


    public Doctor(String name, String email){
        super(name,email);
        this.speciality=speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (String date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +"Speciality: "+speciality+"\nAvailable " +availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital A");
        System.out.println("Hospital B");
    }

    public static class AvailableAppointment{
        private Date date;
        private String time;
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) {

            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }


        @Override
        public String toString() {
            return "Available Appointments \n Date: "+date + "\n Time: " + time;
        }
    }
}
