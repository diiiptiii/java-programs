class overloading {
    String name;
    int age;
    
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name, int age){
        System.out.println(name + " " + age);
    }

    public static void main(String[] args){
        overloading s1 = new overloading();
        s1.name = "dipti";
        s1.age = 19;

        s1.printinfo(s1.name, s1.age);
    }


}

