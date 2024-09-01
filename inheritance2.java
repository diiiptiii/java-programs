class A{  
    void msg(){System.out.println("Hello");}  
    }  
    class B{  
    void dipti(){System.out.println("Welcome");}  
    }  
    class C extends A{//suppose if it were  
       
     public static void main(String args[]){  
       C obj=new C();  
       obj.msg();//Now which msg() method would be invoked?  
    }  
    }  
    