public class Account {
    private String accountNumber;
    private double balance;

    public Account() {
    }
    public Account(String accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null) 
            this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        // if (balance >= 0)
            this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    

    public void deposit(double amount) {
        if (amount >= 0) {
                balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0 ) {
            balance = balance - amount;
            System.out.println("Withdraw Successful");
        }
        else
            System.out.println("Invalid Amount Entered");
    }


    public void setOverdraftLimit(double amount){}
    
    public void accountInfo(){
        System.out.println("Account Number : " + accountNumber + "\nBalance : "+ balance);
    }
}