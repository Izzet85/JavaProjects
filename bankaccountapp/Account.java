package bankaccountapp;

public abstract class Account implements IBaseRate {
// instance variables which will be inherited by the subclasses
 private String name;
 private String socialSecurityNumber;
 private double balance;

 private static int index = 10000;

 protected String accountNumber;
 protected double rate;

// Constructor
public Account(String name, String socialSecurityNumber,double initDeposit){
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
    balance = initDeposit;

    // method to set account number
    index++;
    this.accountNumber = setAccountNumber();
    System.out.println(getBaseRate());
    setRate();


}
    public abstract void setRate();



    private String setAccountNumber(){
    String lastTwoOfSSN = socialSecurityNumber.substring(socialSecurityNumber.length() -2,socialSecurityNumber.length());
    int uniqueId = index;
    int  randomDigits = (int) ( Math.random()  * Math.pow(10,3));
//            (int)  (Math.random() * (10 +1))+ (int) (Math.random() * (10 +1));
            return lastTwoOfSSN + uniqueId+randomDigits;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("accruedInterest: " + accruedInterest);

    }









// common Methods which will be inherited by the subclasses


    public void deposit(double amount){

        balance = balance + amount;
        System.out.println("Depositing "+ amount);
        printBalance();

    }
    public void withdraw(double withdraw){

        balance = balance - withdraw;
        System.out.println("Withdrawing "+withdraw);
        printBalance();

    }
    public void transfer(String toWhere, double amount){
        balance = balance -amount;
        System.out.println("Transfering $"+ amount + " to " + toWhere);
        printBalance();

    }

    public void printBalance(){
        System.out.println("Your balance is now: " + balance);

    }









    public void showInfo(){
        System.out.println(
                "NAME: " +name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE  " + balance +
                        "\nRATE: " + rate +"%"

        );
    }




}
