package inheritance;

public class User {
    public String name;
    public String address;
    public String phoneNo;
    public String dob;
    public String email;

    public String getPesonalInfo(){
        return this.name + " : " + this.address + " : "+ this.dob+ " : "+ this.email;
    }
}
