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
        myBank.returnAccount("Olivia").deposit(250);
        myBank.returnAccount("Olivia");

        myBank.returnAccount("Kim").withdrawal(133);
        myBank.returnAccount("Kim");
        myBank.returnAccount("Kim").deposit(200);
    }
}
