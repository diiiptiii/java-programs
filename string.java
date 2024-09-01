import java.util.*;
class string{

}
class Address{
    String address;
    Scanner sc = new Scanner(System.in);
    void setaddress(){
        System.out.print("Enter the Address: ");
        address = sc.nextLine();
    }
    void getaddress(){
        
        System.out.print("Address is: "+address);
    }
}
class Homeaddress extends Address{
    void getaddress() {

        System.out.print("Address is: " + address);
    }

}
class Officeadress extends Address{
    void getaddress() {
        System.out.print("Address is: " + address);
    }

}
class Schooladdress extends Address{
    void getaddress() {

        System.out.print("Address is: " + address);
    }

}

class mainmethod{
    public static void main(String[] args) {
        Address ob=new Address();
        Address ref;   
        Homeaddress ob1=new Homeaddress();
        ref=ob1;
        ref.setaddress();
        ob1.getaddress();
        Officeadress ob2=new Officeadress();
        ref=ob2;
        ref.setaddress();
        ref.getaddress();
        Schooladdress ob3=new Schooladdress();
        ref=ob3;
        ref.setaddress();
        ref.getaddress();
    }
    }