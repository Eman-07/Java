public class BusinessAccount extends Account {

    private String businessName;

    public BusinessAccount(String businessName){
        this.businessName = businessName;
    }

    public String getBusinessName(){
        return businessName;
    }


    @Override
    public void withdraw(double amount){// to be modified
        super.withdraw(amount);
    }

}
