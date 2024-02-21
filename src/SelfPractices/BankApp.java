package SelfPractices;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(10_000, "DB");
        BankAccount bank2 = new BankAccount(150_000, "ING Bank");

        System.out.println(bank2);
        System.out.println(bank1);


        ElectronicWallet wallet = new ElectronicWallet(10, "ZondaWallet");

        System.out.println(wallet);

        bank1.transferMoney(10_000, wallet);
        System.out.println("Wallet after transferred from " + bank1.getBankName() + " " + wallet);

        wallet.transferMoney(10.1923, bank1);
        System.out.println(bank1);
        System.out.println("BankAccount after transferred from " + wallet.getWalletTitle() + " " + bank1 );


    }
}
