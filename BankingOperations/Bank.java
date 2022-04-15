package BankingOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Bank extends BankAccount{
    private static Bank bank;
    private String bankName;
    private List<BankAccount> bankAccountList=new ArrayList<BankAccount>();

    private Bank(){
        super();
    }

    public static Bank getInstance(){
        if(bank==null){
            bank=new Bank();
            bank.setBankName("MyBank");
        }
        return bank;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public void addAccount(String bankAccountHolderName, double accountBalance){
        BankAccount bankAccount=new Bank();
        bankAccount.setBankAccountHolderName(bankAccountHolderName);
        bankAccount.setAccountBalance(accountBalance);
        bankAccountList.add(bankAccount);
        System.out.println("Account with name: "+bankAccountHolderName+" and amount "+accountBalance+" was created");
    }

    //see accounts list sort ascending by account balance
    public void seeAccounts(){
        Collections.sort(bankAccountList, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount b1, BankAccount b2) {
                return Double.compare(b1.getAccountBalance(), b2.getAccountBalance());
            }
        });
        for(BankAccount bankAccount:bankAccountList){
                System.out.println(bankAccount);
            }
    }

    //see accounts between specified account balance interval
    public void seeAccounts(double minAmount,double maxAmount){
        for(BankAccount bankAccount:bankAccountList) {
            if (bankAccount.getAccountBalance() >= minAmount && bankAccount.getAccountBalance() <= maxAmount) {
                System.out.println(bankAccount);
            }
        }
    }

    //Valid for unique name accounts. if we have more accounts with same name we have to return a list of type BankAccount
    public BankAccount returnAccount(String name){
        for(BankAccount bankAccount:bankAccountList){
            if(bankAccount.getBankAccountHolderName().equals(name)){
                return bankAccount;
            }
        }
        return null;
    }
}
