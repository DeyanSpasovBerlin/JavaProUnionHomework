package Summary20_12_2024;

public class Customers implements Runnable{

    BankAcount bank;

    public Customers(BankAcount bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        int i = 0;
        while (i++ < 10) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (bank) {
                System.out.println(Thread.currentThread().getName() + " +10 dol");
                bank.setBalance(bank.getBalance() + 10);
                System.out.println(bank.getBalance());
            }


        }
    }
}


//2. Имеется общий счет. Два пользователя раз в 1 сек. кладут 10 $ на этот счет. Реализовать потокобезопасным способом.