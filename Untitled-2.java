import java.util.*;
abstract class Shape{
   void area(){}

}

public class program2 extends Shape {
    void area(double r) {
        System.out.print("Area of circle is :" + 3.14 * r * r + "\n");
    }

    void area(int a) {
        System.out.print("Area of square is :" + a * a + "\n");
    }
    void area(int b, int h) {
        System.out.print("Area of triangle is :" + 0.5 * b * h + "\n");
    }

    public static void main(String[] args) {
        program2 ob = new program2();
        Scanner sc = new Scanner(System.in);
        System.out.print("1)Area of Circle\n2)Area of square\n3)Area of Triangle\n4)Exit");
        while (true) {
            System.out.print("\nEnter the Option:");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    ob.area(2.3);
                    break;
                case 2:
                    ob.area(4);
                    break;
                case 3:
                    ob.area(9, 8);
                    break;
                case 4:
                    break;
            }

}
}
}