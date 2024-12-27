package Summary20_12_2024;

public class MainCustomers {
    public static void main(String[] args) {
        BankAcount genBank = new BankAcount();
        Customers cus1 = new Customers(genBank);
        Thread thCus1 = new Thread(cus1,"thread1");
        Customers cus2 = new Customers(genBank);
        Thread thCus2 = new Thread(cus2,"thread2");
        thCus1.start();
        thCus2.start();
    }
}
