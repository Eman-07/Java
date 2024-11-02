public class SavingAccount extends Account {
    private final double interestRate = 1.5;


    public double getInterestRate(){
        return interestRate;
    }

    @Override
    public void withdraw(double amount){
        if (amount > 20000) {
            System.out.println("Amount exceeds withdrawl limits.");
        }
        else
            super.withdraw(amount);
    }







}
