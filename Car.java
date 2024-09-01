class Car{
    int number;
    Car(int number) {
        this.number=number;
    }
        public static void swap(Car c1, Car c2){
            int temp=c1.number;
            c1.number=c2.number;
            c2.number=temp;
        }
        public static void main(String args[]){
            Car c1=new Car(1);
            Car c2=new Car(2);
            swap(c1,c2);
            System.out.println("c1.number="+c1.number);
            System.out.println("c1.number="+c2.number);
        }
    }
