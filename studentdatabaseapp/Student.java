package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


// Constructor  student

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student first name:  ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name:  ");
        this.lastName = in.nextLine();


        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n5 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + "   " + lastName + "   " + gradeYear);

        setStudentID();
        System.out.println(firstName + "   " + lastName + "   " + gradeYear + "   " + studentId);


    }

// Generate an ID

    private void setStudentID() {
//        grade Level +ID
        id++;
        this.studentId = gradeYear + "" + id;


    }

// Enroll in courses

    public void enroll() {
        do {
            System.out.println("Enter course to enroll (0 to quit )");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else {
                break;
            }
        } while (1 != 0);


        System.out.println("ENROLLED IN:  " + courses);
        System.out.println("TUITION BALANCE " + tuitionBalance);

    }

//            view balance

    public void viewBalance() {
        System.out.println("Your balance is =" + tuitionBalance);
    }


//    Pay tuition

    public void payTuition() {
        System.out.println("Enter your payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        System.out.println("");
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();


    }


//    Show Status
public void showInfo(){

    System.out.println( "Name  "+ firstName + " " + lastName +
            "\nGrade Level:  " + gradeYear +
            "\n Student id is "+ studentId +
            "\nCourses Enrolled " + courses   +
            "\nBalance is " + tuitionBalance  );

}


}
