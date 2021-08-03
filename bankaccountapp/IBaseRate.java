package bankaccountapp;

public interface IBaseRate {


//    method which returns the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
