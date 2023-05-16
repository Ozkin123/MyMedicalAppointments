import java.util.Date;

import static IU.IUMenu.*;

public class Main {
    public static void main(String[] args) {

       // showPatientMenu();
        //showMenu();

        Doctor myDoctor = new Doctor("Pepito Perez", "Oncologia");
        myDoctor.addAvailableAppointment(new Date(),"10AM");

        for (Doctor.AvailableAppointment dd: myDoctor.getAvailableAppointments()) {
            System.out.println(dd.getDate()+" "+dd.getTime());
        }

    }
}