public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        a.setAccountId("eman17");
        a.setInternetPlanType(InternetPlanType.Unlimited);
        a.useData();
        a.display();

    }
}
