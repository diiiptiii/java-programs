import java.util.*;

class lab6student
{
    String name;
    int roll;
    float cgpa;
    public lab6student(String name, int roll, float cgpa)
    {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }
    void displayData()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("CGPA : " + cgpa);
    }
}

public class details6{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        lab6student[] s = new lab6student[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Name : ");
            String name = sc.next();
            System.out.print("Roll No : ");
            int roll = sc.nextInt();
            System.out.print("CGPA : ");
            float cgpa = sc.nextFloat();
            s[i] = new lab6student (name, roll, cgpa);
        }
        for (int i = 0; i < n; i++)
        {
            s[i].displayData();
        }
    }
}