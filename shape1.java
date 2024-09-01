import java.util.*;

abstract class shape1 {
    void display() {
    }
}

class twoD extends shape1 {
    void display() {
        System.out.println("2D image");
    }
}

class threeD extends shape1 {
    void display() {
        System.out.println("3D image");
    }
}

class java22 {
    public static void main(String args[]) {
        shape1 ref;
        ref = new twoD();
        ref.display();

        ref = new threeD();
        ref.display();
    }
}