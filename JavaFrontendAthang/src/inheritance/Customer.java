package inheritance;

public class Customer extends User{
    public String accNo;
    public String availableBal;
    public String accountBranch;

    public String getPesonalInfo(){
        return super.getPesonalInfo()+ " " +this.accNo+ " " +this.availableBal+ " " +this.accountBranch;
    }

}
