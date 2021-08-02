package bankaccountapp;

public abstract class Account implements IBaseRate {
// instance variables which will be inherited by the subclasses
 String name;
 String socialSecurityNumber;
 double balance;

 static int index = 10000;

 String accountNumber;
 double rate;

// Constructor
public Account(String name, String socialSecurityNumber,double initDeposit){
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
    balance = initDeposit;

    // method to set account number
    index++;
    this.accountNumber = setAccountNumber();

}



    private String setAccountNumber(){
    String lastTwoOfSSN = socialSecurityNumber.substring(socialSecurityNumber.length() -2,socialSecurityNumber.length());
    int uniqueId = index;
    int  randomDigits = (int) ( Math.random()  * Math.pow(10,3));
//            (int)  (Math.random() * (10 +1))+ (int) (Math.random() * (10 +1));
            return lastTwoOfSSN + uniqueId+randomDigits;
    }



    public void showInfo(){
        System.out.println(
                "NAME: " +name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE  " + balance

        );
    }




// common Methods which will be inherited by the subclasses


}
