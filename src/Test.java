//Super class
class vehicle {
    vehicle(){
        System.out.println("This is an example of a single inheritance");
    }
}
//subclass
class Car extends vehicle {
    Car(){
        System.out.println("This Vehicle is Car");
    }
}
public class  Test {
    public static void main (String[]args){
        Car obj = new Car();
        //System.out.println(obj);
    }
}