import java.util.Scanner;
public class shape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Fname,Lname;
        System.out.print("Enter your First Name :");
        Fname=sc.next();
        System.out.print("Enter your Last Name :");
        Lname = sc.next();
        System.out.print("Your Name is :"+Fname + " " +Lname);
    }
}