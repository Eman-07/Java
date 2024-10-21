public class Account {
    private String accountId;
    private InternetPlanType planType;
    private double dataUsage;
    private double dataLeft;

    public Account(String aacountId, InternetPlanType planType){
        setAccountId(aacountId);
        setInternetPlanType(planType);
        dataLeft = planType.getData();
    }

    public Account(){
        this("Guest", InternetPlanType.None);
    }

    public double calculateBill(){

        return 0;
    }

    public void setAccountId(String id){
        this.accountId = id;
    }

    public void setInternetPlanType(InternetPlanType plan){
        this.planType = plan;
    }

    
}
