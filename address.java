import java.util.*;
class Address{
    String Address;
    Scanner sc=new Scanner(System.in);
    void setaddress(){
        System.out.println("address is" +Address);
        Address=sc.nextLine();
    }
    void getaddress(){
        System.out.println("address is"+Address);

    }
}
class homeaddress extends Address{
void getaddress(){
    System.out.println("address is"+Address);
}
}
class officeaddress extends Address{
    void getaddress(){
        System.out.println("address is"+Address);
    }
}
class schooladdress extends Address{
void getaddress(){
    System.out.println("address is"+Address);
}
}
class mainmethod{
    public static void main(string args[]){
        Address ob=new Address();
        Address ref;
        Homeaddress ob1=new Homeaddress();
        ref=ob1;
        ref.setaddress();
        ob1.getaddress();
        officeaddress ob2= new officeaddress();
        ref=ob2;
        ref.setaddress();
        ob2.getaddress();
        Schooladdress ob3=new Schooladdress();
        ref=ob3;
        ref.setaddress();
        ob3.getaddress();

    }
}