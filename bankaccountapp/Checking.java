package bankaccountapp;

public class Checking extends Account{

//    checking account specific properties
    int debitCardNumber;
    int debitCardPin;

//    constructor
    public Checking(String name,String socialSecurityNumber, double balance){
        super(name,socialSecurityNumber,balance);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }



//   checking account specific methods

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10 , 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));


    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCCOUNT TYPE: Checking");
        System.out.println("DEBITCARD NUMBER: " + this.debitCardNumber);
        System.out.println("DEBITCARD PIN: " + this.debitCardPin);

    }


}
