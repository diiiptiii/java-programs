public class doubt {
    void doubt1(){
    System.out.println("puneet lauda hai"); 
    } 
}
class lala extends doubt{
    void doubt2(){
    System.out.println("puneet ek chutiya hai");    
}}
class ululu extends doubt{
    void doubt3(){
    System.out.println("puneet ek chutiya hai");   
} 
}
class puneetsmart{
public static void main(String args[]){
     ululu u=new ululu();
     u.doubt1();
     u.doubt2();
     u.doubt3();
}
}
