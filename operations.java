public class operations{
    int a;
    int b;
    double result;
    int sum;
    public void addition(){
        result = a + b;
        System.out.println(result);
    }
    public void difference(){
        result = a - b;
        System.out.println(result);
    }
    public void division(){
        result = a / b; 
        System.out.println(result);
    }

    public static void main(String[] args){
        operations dipti = new operations();
        dipti.a = 765;
        dipti.b = 5;
        dipti.addition();
        dipti.difference();
        dipti.division();

        System.out.println("THE END");
    }
}
