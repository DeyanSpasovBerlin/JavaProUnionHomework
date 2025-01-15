package Homework_2025_01_09.Bank;

public class StateAsObjectRaceCondition {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000, 1000);
        AccountManager accountManager = new AccountManager(bankAccount);


        new Thread(() -> {
//                synchronized (bankAccount) {
                    while (true) {
                        accountManager.moveMoneyAToB(10);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
//                }
        }).start();
        synchronized (accountManager) {
            int sum = accountManager.getBankAccount().getAccountA() + accountManager.getBankAccount().getAccountB();
            System.out.println("Total sum: " + sum);
        }

        while (true) {

                BankAccount account = accountManager.getBankAccount();
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int accountA = account.getAccountA();
                int accountB = account.getAccountB();
                int balance = accountA + accountB;
                System.out.println("accountA: " + accountA + ", accountB: " + accountB + ", total balance: " + balance);
            }


    }


}
/*

См. набор классов в пакете lesson20250109.hometask
    В банке (класс BankAccount) у клиента имеется два счета.
    В классе AccountManager реализован synchronized метод moveMoneyAToB() перевода денег со счета A на счет Б
    и synchronized метод getBankAccount() извлечения счета.
    Тем не менее в классе StateAsObjectRaceCondition при применении данных методов выводится неверная информация о счете.
    Предложить варианты исправления данного набора классов
 */