package inheritance;

public class Employee extends User{
    public String department;
    public String workingBranch;
    public String extension;
    public String employeeType;

    public String getPesonalInfo(){
        return super.getPesonalInfo() + " " + this.department + " " + this.employeeType + " " + this.extension + " " + this.workingBranch;
    }

}
