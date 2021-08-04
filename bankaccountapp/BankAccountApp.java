package bankaccountapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "/Users/iates/Downloads/NewBankAccounts.csv";

//  Creating new bank accounts based on CSV File data.




        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders ){
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            String name = accountHolder[0];
            String sSn = accountHolder[0];
            String accountType = accountHolder[0];
            double initDeposit = Double.parseDouble(accountHolder[0]);
            System.out.println(name + " " + sSn + " " + accountType +" " + initDeposit);



        }



//
//Checking checking1 = new Checking("Izzet","987654321",1234);
//
//
//
//
//Savings saving1 = new Savings("Ates","123456789",1234);
//
//saving1.showInfo();
//
//System.out.println("***************************************************");
//
//checking1.showInfo();
//
//saving1.deposit(2500);
//saving1.withdraw(500);
//saving1.transfer("Brokerage",500);
//saving1.compound();
    }
}
