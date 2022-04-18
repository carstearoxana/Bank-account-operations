package BankingOperations;

public class IncorrectDepositAmountException extends Exception {
    public IncorrectDepositAmountException(String s) {
        super(s);
    }
}
