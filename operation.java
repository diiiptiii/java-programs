import java.util.*;

class Operation
{
    int i;
    void subtract ()
    {
        int n1,n2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1 : ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        n2 = sc.nextInt();
        System.out.println("The subtraction of the two numbers is : " + (n1-n2));
    }
    void subtract (int n1)
    {
        int n2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter another number : ");
        n2 = sc.nextInt();
        System.out.println("The subtraction of the two numbers is : " + (n1-n2));
    }
    void subtract (int n1, int n2)
    {
        System.out.println("The subtraction of the two numbers is : " + (n1-n2));
    }
}

public class operation{
    public static void main (String args[])
    {
     Operation o = new Operation();
     o.subtract();
     o.subtract(10);
     o.subtract(20,10);
    }
}