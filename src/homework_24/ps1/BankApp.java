package homework_24.ps1;

public class BankApp {
    public static void main(String[] args) {
        BankAcc bank = new BankAcc("Bank1", 10000);
        EWallet wallet = new EWallet("E-Wallet", 5000);

        System.out.println(bank);
        bank.withdrawMoney(500000);
        bank.withdrawMoney(500);
        System.out.println(bank);

        wallet.transferMoney(1500);
        System.out.println(wallet);
    }
}