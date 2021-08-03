package bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {

//  Creating new bank accounts based on CSV File data.

Checking checking1 = new Checking("Izzet","987654321",1234);




Savings saving1 = new Savings("Ates","123456789",1234);

saving1.showInfo();

System.out.println("***************************************************");

checking1.showInfo();

saving1.deposit(2500);
saving1.withdraw(500);
saving1.transfer("Brokerage",500);
saving1.compound();
    }
}
