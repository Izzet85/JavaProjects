package bankaccountapp;

public class Checking extends Account{

//    checking account specific properties
    private int debitCardNumber;
    private int debitCardPin;

//    constructor
    public Checking(String name,String socialSecurityNumber, double balance){
        super(name,socialSecurityNumber,balance);
        accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() *0.15;


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
