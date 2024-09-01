class overriding{

    void run(int i){System.out.println("Vehicle is running");}
}
    class Bike2 extends overriding{
    void run(int j){System.out.println("Bike is running safely");}    

    public static void main(String args[]){
        int k = 5;
    overriding obj = new overriding();
    obj.run(k);
    }
} 