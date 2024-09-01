import java.util.*;

class Bank {
    Scanner sc = new Scanner(System.in);
    double roi;
    int p, n;
    double si;

    void find_roi() {
    }
}

class HDFC extends Bank {
    void find_roi() {
        System.out.println("Enter principle and no. of years");
        p = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter ROI of HDFC:");
        roi = sc.nextDouble();
        si = (p * n * roi) / 100;
        System.out.println("The simple interest is:" + si);
    }
}

class ICICI extends Bank {
    void find_roi() {
        System.out.println("Enter principle and no. of years");
        p = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter ROI of ICICI:");
        roi = sc.nextDouble();
        si = (p * n * roi) / 100;
        System.out.println("The simple interest is:" + si);
    }
}

class BOI extends Bank {
    void find_roi() {
        System.out.println("Enter principle and no. of years");
        p = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter ROI of BOI:");
        roi = sc.nextDouble();
        si = (p * n * roi) / 100;
        System.out.println("The simple interest is:" + si);
    }ref.find_roi();
    ICICI ob2= new ICICI();
    ref=ob2;
    ref.find_roi();
    BOI ob3= new BOI();
    ref=ob3;
    ob3.find_roi();

}


class Main{
    public static void main(String args[]) {
        Bank ref;
        HDFC ob1= new HDFC();
        ref=ob1;
