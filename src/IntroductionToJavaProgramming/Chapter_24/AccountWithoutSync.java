package IntroductionToJavaProgramming.Chapter_24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Suheng on 6/7/15.
 */
public class AccountWithoutSync {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Create and launch 100 threads
        for (int i = 0; i < 100; i++) {
            executorService.execute(new AddPennyTask());
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {

        }

        System.out.println("What is balance ?" + account.getBalance());
    }


    private static class AddPennyTask implements Runnable {
        @Override
        public void run() {
            account.deposit(1);
        }
    }

    //An inner class for account
    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return this.balance;
        }

        public void deposit(int amount) {
            int newBalance = this.balance + amount;
            //This is delay is deliberately added to magnify the
            //data-corruption problem and make it easy to see
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
            this.balance = newBalance;
        }
    }
}
