package BankAccountPackage;

public class Main {
    public static void main(String[] args) {
        BankAccount BobAccount = new BankAccount(1000, -1000);
        BankAccount LisaAccount = new BankAccount(1000, -1000);

        System.out.println("Initial Balances:");
        System.out.println("Bob's balance: " + BobAccount.getBalance());
        System.out.println("Lisa's balance: " + LisaAccount.getBalance());

        boolean successTransfer = BobAccount.transfer(500, LisaAccount);
        System.out.println("\nTransfer of 500 from Bob to Lisa: " + (successTransfer ? "Successful" : "Failed"));
        System.out.println("Bob's balance: " + BobAccount.getBalance());
        System.out.println("Lisa's balance: " + LisaAccount.getBalance());

        successTransfer = BobAccount.transfer(1600, LisaAccount);
        System.out.println("\nTransfer of 1600 from Bob to Lisa: " + (successTransfer ? "Successful" : "Failed"));
        System.out.println("Bob's balance: " + BobAccount.getBalance());
        System.out.println("Lisa's balance: " + LisaAccount.getBalance());
    }
}