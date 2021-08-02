package bankaccountapp;

public abstract class Account implements IBaseRate {
// instance variables which will be inherited by the subclasses
 String name;
 String socialSecurityNumber;
 double balance;

 String accountNumber;
 double rate;

// Constructor
public Account(String name, String socialSecurityNumber,double initDeposit){
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
    balance = initDeposit;
    System.out.println("NAME: " + name + " SSN: " + socialSecurityNumber + " BALANCE:  "+ balance);

    // method to set account number
    this.accountNumber = setAccountNumber();
    System.out.println(accountNumber);

}



    private String setAccountNumber(){
    String lastTwoOfSSN = socialSecurityNumber.substring(socialSecurityNumber.length() -2,socialSecurityNumber.length());
            return lastTwoOfSSN;
    }



// common Methods which will be inherited by the subclasses


}
