import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    int id;

    private String speciality;


    Doctor(String name, String email){
        super(name,email);
        this.speciality=speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +"Speciality: "+speciality+"\nAvailable " +availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
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
