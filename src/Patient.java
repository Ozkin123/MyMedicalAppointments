public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthDay;
    private double weight;
    private double height;
    private String blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()>8){
            System.out.println("numero no valido");
        } else if (phoneNumber.length()==8) {
            this.phoneNumber = phoneNumber;
        }

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

    Patient(String name, String email){
        this.name=name;
        this.email=email;
    }
}
