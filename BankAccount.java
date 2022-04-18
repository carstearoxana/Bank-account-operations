package BankingOperations;

public class BankAccount{
    private String bankAccountHolderName;
    private double accountBalance;

    public BankAccount(String bankAccountHolderName, double accountBalance) {
        this.bankAccountHolderName = bankAccountHolderName;
        this.accountBalance = accountBalance;
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public void withdrawal(double amount) throws InsufficientFundsException {
        if(accountBalance<amount){
            throw new InsufficientFundsException(bankAccountHolderName + ", Insufficient funds, your account balance is " + accountBalance);
        }
            else{
                accountBalance = accountBalance - amount;
                System.out.println(bankAccountHolderName + ", You withdrew " + amount + " LEI" + ". Your new account balance is " + accountBalance + " LEI");
            }

    }

    public void deposit(double amount)throws IncorrectDepositAmountException{
        if(amount>0) {
            accountBalance = accountBalance + amount;
            System.out.println(bankAccountHolderName+", You deposit "+amount+" LEI"+". Your new account balance is "+accountBalance+ " LEI");
        }else{
           throw new IncorrectDepositAmountException (bankAccountHolderName+", You cannot deposit an amount less or equal with 0");
        }
    }

    @Override
    public String toString() {
        return bankAccountHolderName +" "+ accountBalance;
    }
}
