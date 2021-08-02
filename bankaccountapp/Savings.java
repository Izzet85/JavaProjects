package bankaccountapp;

public class Savings extends Account {

    //    saving account specific properties
    int safetyDepositBoxID;
    int safetyBoxKey;



    //    constructor
    public Savings(String name,String socialSecurityNumber,double balance){
        super(name,socialSecurityNumber,balance);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }


    //    saving account specific methods
    public void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyBoxKey       = (int) (Math.random() * Math.pow(10, 4));

    }

    public void showInfo(){
//        super.showInfo();
        System.out.println("ACOUNT TYPE: Savings account " +
                " \n safety Deposit Box ID: " + safetyDepositBoxID +
                "\n Safety Deposit Box KEY: "  + safetyBoxKey);

    }



}
