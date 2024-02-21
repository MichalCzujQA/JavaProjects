package SelfPractices;

/*
Task 0 Платежные системы Создайте интерфейс PaymentSystem с методами transferMoney, withdrawMoney и checkBalance.
Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */
public class BankAccount extends VusaMember implements PaymentSystem {



    private double balance;

    private String bankName;


    public BankAccount(double balance, String bankName) {
        super("EUR");
        this.balance = balance;
        this.bankName = bankName;
    }

    @Override
    public boolean transferMoney(double amountEur, PaymentSystem recipient) {
        if (amountEur > balance) {
            System.out.printf("You don't have enough money: (am: %.2f | bal: %.2f)\n", amountEur, balance);
            return false;
        }
        if (recipient.getCurrency().equals("EUR")) {
            recipient.depositTransfer(amountEur);
            System.out.printf("YooHoo! Transferred %.2f EUR(%s) -> %s \n", amountEur,bankName,recipient.getTitle());
            balance -= amountEur;
            return true;
        }else if (recipient.getCurrency().equals("BTC")){
            double amountTransferBtc = amountEur / getCourseBTS();
            recipient.depositTransfer(amountTransferBtc);
            System.out.printf("YooHoo! Transferred %.2f EUR(%s) -> %.2f BTC (%s) \n", amountEur,bankName,amountTransferBtc,recipient.getTitle());
            balance-=amountEur;
            return true;

        }
        System.err.println("Something going wrong with recipient transfer!");
        return false;

    }
    @Override
    public boolean withdrawMoney(double drawMoney){
        if (drawMoney>balance){
            System.out.println("Sorry, you don't have enough money for withdraw");
            return false;
        }
        balance-= drawMoney;
        System.out.println("Congratulation your money are drawing: " + drawMoney + "EUR");
        return true;
    }

    @Override
    public void depositTransfer(double amount){
        balance += amount;
    }
    @Override
    public String getTitle(){
        return bankName;
    }

    @Override
    public double checkBalance(){
        return balance;
    }


    public double getBalance(){
        return balance;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank {" +
                "balance=" + balance + "EUR" +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
