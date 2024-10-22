import java.util.Scanner;;
public class Account {
    private String accountId;
    private InternetPlanType planType;
    private double dataUsage;
    private double dataLeft;

    public Account(String aacountId, InternetPlanType planType){
        setAccountId(aacountId);
        setInternetPlanType(planType);
        dataLeft = planType.getData();
        dataUsage = 0 ;
    }

    public Account(){
        this("Guest", InternetPlanType.None);
    }


    public void setAccountId(String id){
        this.accountId = id;
    }

    public void setInternetPlanType(InternetPlanType plan){
        this.planType = plan;
        dataLeft = planType.getData();

    }

    
    //Funtions
    Scanner sc = new Scanner(System.in);
    public void useData(){
        System.out.printf("Enter amount of data you want to use : ");
        double use = sc.nextDouble();

        if (use < dataLeft ) {
            dataLeft = dataLeft - use;
            dataUsage = dataUsage + use;
        }
        else{
            System.out.println("Invalid Entry!!!");
            useData();
        }
    }
    
    public double calculateBill(){
        double bill = 0;

        if (planType == InternetPlanType.Premium) {
            //12% discount
            double discount = (planType.getPrice() / 100 ) * 12;
            bill = planType.getPrice() - discount; 
        }
        else if (planType == InternetPlanType.Unlimited) {
            //25% discount
            double discount = (planType.getPrice() / 100 ) * 25;
            bill = planType.getPrice() - discount; 
        }
        else{
            bill = planType.getPrice();             
        }
        return bill;
    }


    public void display(){
        System.out.printf("Account Id : %s\nPlan : %s\nData : %.2f Gb\nPrice : %.2f Pkr \nData Used : %.2f Gb\nData Left : %.2f Gb",accountId,planType,planType.getData(),planType.getPrice(),dataUsage,dataLeft);
     }
}
