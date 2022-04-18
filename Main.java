package BankingOperations;

public class Main {
    public static void main(String[] args) {
        Bank myBank= Bank.getInstance();
        System.out.println(myBank.getBankName());
        myBank.addAccount("Joe",315.4);
        myBank.addAccount("Jack",100.5);
        myBank.addAccount("Mark", 100.6);
        myBank.addAccount("Olivia", 100.4);
        myBank.addAccount("Tom", 100.8);
        myBank.addAccount("Kim", 400);
        myBank.addAccount("Billy", 150);


        System.out.println(myBank.getBankAccountList());
        myBank.seeAccounts();
        System.out.println();
        myBank.seeAccounts(100.6,320);
        System.out.println();
        System.out.println(myBank.returnAccount("Mark"));

        try {
            myBank.returnAccount("Olivia").deposit(250);
        }catch (IncorrectDepositAmountException e){
            System.out.println("Exception occured: "+e);
        }
        myBank.returnAccount("Olivia");

        try {
            myBank.returnAccount("Kim").withdrawal(133);
        }catch (InsufficientFundsException e){
            System.out.println("Exception occured: "+e);
        }
        myBank.returnAccount("Kim");

        try{
        myBank.returnAccount("Kim").deposit(200);
        }catch (IncorrectDepositAmountException e){
            System.out.println("Exception occured: "+e);
        }
        try{
        myBank.returnAccount("Tom").deposit(0);
        }catch (IncorrectDepositAmountException e){
            System.out.println("Exception occured: "+e);
        }
        try {
            myBank.returnAccount("Mark").withdrawal(200);
        }catch (InsufficientFundsException e){
            System.out.println("Exception occured: "+e);
        }
    }
}
