import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    int id;
    private String name;
    private String speciality;
    private String enail;

    Doctor(String name, String speciality){
        this.name=name;
        this.speciality=speciality;
    }


    public void showName(){
        System.out.println(name);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment (Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
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


    }

}
