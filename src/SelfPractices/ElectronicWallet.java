package SelfPractices;

public class ElectronicWallet extends VusaMember implements PaymentSystem {
    private String walletTitle;
    private double balance;


    public ElectronicWallet(double balance, String walletTitle) {
        super("BTC");
        this.walletTitle = walletTitle;
        this.balance = balance;
    }

    @Override
    public boolean transferMoney(double amountBtc, PaymentSystem recipient) {
        if (amountBtc > balance) {
            System.out.printf("You don't have enough money: (am: %.2f | bal: %.2f)\n", amountBtc, balance);
            return false;
        }
        if (recipient.getCurrency().equals("BTC")) {
            recipient.depositTransfer(amountBtc);
            System.out.printf("YooHoo! Transferred %.2f BTC (%s) -> %s \n", amountBtc, walletTitle, recipient.getTitle());
            balance -= amountBtc;
            return true;
        } else if (recipient.getCurrency().equals("EUR")) {
            double amountTransferEur = amountBtc * getCourseBTS();
            recipient.depositTransfer(amountTransferEur);
            System.out.printf("YooHoo! Transferred %.2f BTC (%s) -> %.2f EUR (%s) \n", amountBtc, walletTitle, amountTransferEur, recipient.getTitle());
            balance -= amountBtc;
            return true;

        }
        System.err.println("Something going wrong with recipient transfer!");
        return false;

    }

    @Override
    public boolean withdrawMoney(double drawMoney) {
        if (drawMoney > balance) {
            System.out.println("You have not enough money!");
            return false;
        }
        balance -= drawMoney;
        System.out.println("YooHoo, withdraw: " + drawMoney + " BTC");
        return true;
    }

    @Override
    public double checkBalance(){
        return balance;
    }
    @Override
    public void  depositTransfer(double amountBtc){
        balance += amountBtc;
    }
    @Override
    public String getTitle(){
        return walletTitle;
    }

    public String getWalletTitle(){
        return walletTitle;
    }
    public void setWalletTitle(String walletTitle){
        this.walletTitle = walletTitle;
    }
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                ", balance=" + String.format("%.4f", balance)  + " BTC" +
                "walletTitle='" + walletTitle + '\'' +
                '}';

    }
}
