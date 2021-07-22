package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "techgrounds";

//    Constructor firstname and lastname
   public Email(String firstName,String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       System.out.println("email created: " + this.firstName + " " +this.lastName);

       this.department = setDepartment();

       this.password = generatePassword(defaultPasswordLength);
       System.out.println( "Your password is "+ password);

//       combine elements to generate email adress

   email = firstName.toLowerCase() +"." + lastName.toLowerCase() +"@" + department.toLowerCase()+"."+ companySuffix +".com";

   }
//    ask for the department
    private String setDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "sales";
        }else if(depChoice == 2){
            return "Dev";
        }else if( depChoice ==3){
            return "acct";
        }else{
            return"";
        }
    }

//    method call to generate a random password and update the instance variable password



//    generate a random password for email

      private String generatePassword(int length){
       String passwordSet = "ABCDEFGHIJKLMNOPQRST0123456789!@#$%";
       char [] password = new char[length];
       for (int i=0;i<length;i++){
         int random =  (int) (Math.random() * passwordSet.length()) ;
           System.out.println(random);
           password[i] = passwordSet.charAt(random);
       }

       return new String(password);

    }
//    set the mailbox capacity

    public void setMailboxCapacity(int capacity){
       this.mailboxCapacity = capacity;
    }
//    set alternate email

    public void setAlternateEmail(String email){
       this.alternateEmail = email;
    }
//    change password
public void changePassword(String password){
       this.password = password;
}
public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
public String getPassword(){return password;}


public String showInfo(){
    return "DISPLAY NAME " + firstName + " " + lastName + "\2 " +
            "COMPANY EMAIL " + email + "\2MAILBOX CAPACITY " + mailboxCapacity +" mb";

}}