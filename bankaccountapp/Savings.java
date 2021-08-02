package bankaccountapp;

public class Savings extends Account {

    //    saving account specific properties
    int safetyDepositBoxID;
    int safetyBoxKey;



    //    constructor
    public Savings(String name,String socialSecurityNumber,double balance){
        super(name,socialSecurityNumber,balance);
        System.out.println("New saving account");
    }


    //    saving account specific methods




}
