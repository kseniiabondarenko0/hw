package Task20;


public class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(100);

            Thread t1 = new Thread(new Runnable() {
                public void run() {
                    account.deposit(50);
                }
            });

            Thread t2 = new Thread(new Runnable() {
                public void run() {
                    account.withdraw(50);
                }
            });

            Thread t3 = new Thread(new Runnable() {
                public void run() {
                    account.deposit(250);
                }
            });

            t1.start();
            t2.start();
            t3.start();


            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

