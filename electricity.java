import java.util.Scanner;
public class electricity {
    public class program5 {
        public static void main(String[] args) {
            float u;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the  Electricity Unit:");
            u=sc.nextInt();
            if(u<=50){
                System.out.print("Your Bill is :"+u*2.5);
            }
            if(u>50 && u<=100){
                System.out.print("Your Bill is :" + u * 3.5);
    
            }
            if (u > 100 && u <= 150) {
                System.out.print("Your Bill is :" + u * 4.5);
            }
        }
    }
}