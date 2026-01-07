public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Anderson", 1000);
        BankApp bankApp = new BankApp();
        bankApp.menu(bankAccount1);
    }
}
