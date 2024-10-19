public class CheckingAccount extends Account {
    private double overDraftLimit;


    public CheckingAccount(String accountNumber,double balance,double limit){
        super(accountNumber,balance);
        setOverdraftLimit(limit);
    }
    public CheckingAccount(){
        this("blank", 0, 0);
    }


    @Override
    public void setOverdraftLimit(double limit){
        if (limit >= 0) {
            this.overDraftLimit = limit;
        }
    }
    public double getOverdraftLimit(){
        return overDraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (amount > getBalance() && amount <= overDraftLimit && getBalance() > (-overDraftLimit)) {
            setBalance(getBalance() - amount);
            System.out.println("withdraw Successful");
        }

        else
            super.withdraw(amount);
    }


    @Override
    public void accountInfo(){
        System.out.println("--------------------------");
        super.accountInfo();
        System.out.println("OverDraft Limit : " + overDraftLimit);
        System.out.println("--------------------------");
    }
}
