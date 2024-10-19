public class Main {
    public static void main(String[] args) {
        Account a1 = new CheckingAccount();
        a1.setAccountNumber("1234567");
        a1.setBalance(50000);
        a1.setOverdraftLimit(5000);



        a1.withdraw(500000);
        a1.accountInfo();
    }
    
}
