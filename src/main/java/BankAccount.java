package BankAccountPackage;

class BankAccount {
    private int balance;
    private int minBalance;

    public BankAccount(int initialBalance, int minimumBalance) {
        this.balance = initialBalance;
        this.minBalance = minimumBalance;
    }

    public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance -= amount;
        return true;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean transfer(int amount, BankAccount targetAccount) {
        if (withdraw(amount)) {
            targetAccount.deposit(amount);
            return true;
        }
        return false;
    }

    public int getBalance() {
        return balance;
    }
}