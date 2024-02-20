public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.isBlocked = false;
    }

    public void deposit(double amount) {
        if (!isBlocked && amount > 0) {
            balance += amount;
            System.out.println(amount + " успішно внесено. Новий баланс: " + balance);
        } else {
            System.out.println("Неможливо внести гроші.");
        }
    }

    public void withdraw(double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " успішно знято. Новий баланс: " + balance);
        } else {
            System.out.println("Неможливо зняти гроші.");
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        if (!isBlocked && amount > 0 && balance >= amount) {
            withdraw(amount);
            receiver.deposit(amount);
            System.out.println(amount + " успішно переказано на рахунок " + receiver.getAccountNumber() + ".");
        } else {
            System.out.println("Неможливо переказати гроші.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void block() {
        isBlocked = true;
        System.out.println("Рахунок " + accountNumber + " заблоковано.");
    }

    public void unblock() {
        isBlocked = false;
        System.out.println("Рахунок " + accountNumber + " розблоковано.");
    }
}
