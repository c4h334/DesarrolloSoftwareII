public class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount() {

    }

    public BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("You cannot deposit a null nor negative amount of money");
        }
    }

    void withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("You cannot deposit an amount of money bigger than your balance");
        }
    }

    void showBalance() {
        System.out.println(getBalance());
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

}
