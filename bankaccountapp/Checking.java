package bankaccountapp;

public class Checking extends Account{

//    checking account specific properties
    int debitCardNumber;
    int debitCardPin;

//    constructor
    public Checking(String name,String socialSecurityNumber, double balance){
        super(name,socialSecurityNumber,balance);

        System.out.println("New checking account");
    }



//   checking account specific methods


}
