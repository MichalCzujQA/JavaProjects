package SelfPractices;

public interface PaymentSystem {
    boolean transferMoney(double amount, PaymentSystem recipient);

    boolean withdrawMoney(double drawMoney);

    double checkBalance();

    String getCurrency();

    void depositTransfer(double amount);

    String getTitle();

}
