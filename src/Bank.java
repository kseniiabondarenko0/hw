public class Bank {
    private BankAccount[] accounts;
    private int numAccounts;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        numAccounts = 0;
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = new BankAccount(accountNumber, initialBalance);
            numAccounts++;
            System.out.println("Рахунок " + accountNumber + " успішно створено.");
        } else {
            System.out.println("Неможливо створити рахунок. Банк заповнений.");
        }
    }

    public void blockAccount(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.block();
        } else {
            System.out.println("Рахунок не знайдено.");
        }
    }

    public void unblockAccount(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.unblock();
        } else {
            System.out.println("Рахунок не знайдено.");
        }
    }

    public void printAllAccounts() {
        System.out.println("Банківські рахунки:");
        for (int i = 0; i < numAccounts; i++) {
            System.out.println(accounts[i].getAccountNumber() + ": Баланс - " + accounts[i].getBalance());
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Рахунок не знайдено.");
        }
    }

    public void transferBetweenAccounts(String senderAccountNumber, String receiverAccountNumber, double amount) {
        BankAccount sender = findAccount(senderAccountNumber);
        BankAccount receiver = findAccount(receiverAccountNumber);
        if (sender != null && receiver != null) {
            sender.transfer(receiver, amount);
        } else {
            System.out.println("Рахунок не знайдено.");
        }
    }

    private BankAccount findAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accountNumber.equals(accounts[i].getAccountNumber())) {
                return accounts[i];
            }
        }
        return null;
    }
}
