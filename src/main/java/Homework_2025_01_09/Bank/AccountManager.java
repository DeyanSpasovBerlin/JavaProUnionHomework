package Homework_2025_01_09.Bank;

public class AccountManager {

    private BankAccount bankAccount;

    public AccountManager(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public synchronized void moveMoneyAToB(int amount) {

            bankAccount.setAccountA(bankAccount.getAccountA() - amount);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bankAccount.setAccountB(bankAccount.getAccountB() + amount);

    }

    public synchronized BankAccount getBankAccount() {
            return bankAccount;
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