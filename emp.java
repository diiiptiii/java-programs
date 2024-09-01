import java.util.*;

abstract class Employee {
    Scanner sc = new Scanner (System.in);
   
    String name;
    String address;
    abstract void display();
    abstract void input();
}

class RegularEmployee extends Employee {

    String department;
    float sal;

     public void input(){
        System.out.println("Enter the name and address of the employee:");
       name = sc.nextLine();
       address = sc.nextLine();
    }

    RegularEmployee(String s1, float x1 )
    {
        department = s1;
        sal  = x1;
    
    }

    public void display(){
        System.out.println("The name of the employee is :" + name);
        System.out.println("The address of the employee is :"+address);
        System.out.println("The department is :" + department);
        System.out.println("The salary of the employee is :" + sal);
    }
}
    

class CasualEmployee extends Employee {
    int hours, rate;

    public void input(){
        System.out.println("Enter the name and address of the employee:");
       name = sc.nextLine();
       address = sc.nextLine();

    }
    CasualEmployee(int h1, int r1){
        hours = h1;
        rate = r1;
        
    }

    public void display(){
        System.out.println("The name of the employee is :" + name);
        System.out.println("The address of the employee is :"+address);
        System.out.println("The no of hours  is :" + hours);
        System.out.println("The rate is :" + rate);

    }
}
    public class emp {
        public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.println("Whose details would you like to know? Enter 1 for Regular, else enter 2 for Casual");
            int no = sc.nextInt();
            if(no ==1){
            
                Employee n = new RegularEmployee("Cse", 1500000);
                n.input();
                n.display();


            }
            else {
                Employee m = new CasualEmployee(10,50);
                m.input();
                m.display();

            }
}

}