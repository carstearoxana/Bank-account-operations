package BankingOperations;

public abstract class BankAccount{
    protected String bankAccountHolderName;
    protected double accountBalance;

    public BankAccount() {
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdrawal(double amount){
        if(accountBalance<amount){
            System.out.println(bankAccountHolderName+", Insufficient funds, your account balance is "+ accountBalance);
        }else{
            accountBalance=accountBalance-amount;
            System.out.println(bankAccountHolderName+", You withdrew "+amount+" LEI"+". Your new account balance is "+accountBalance+ " LEI");
        }
    }

    public void deposit(double amount){
        if(amount>0) {
            accountBalance = accountBalance + amount;
            System.out.println(bankAccountHolderName+", You deposit "+amount+" LEI"+". Your new account balance is "+accountBalance+ " LEI");
        }else{
            System.out.println(bankAccountHolderName+", You cannot deposit an amount less or equal with 0");
        }
    }

    @Override
    public String toString() {
        return bankAccountHolderName +" "+ accountBalance;
    }
}
