class mammal {
    void move(){
        System.out.println("Animal is moving");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends mammal {
     void move(){
        //super.move();
        System.out.println("Dog is running");
    }

     void bark(){
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        mammal obj1 = new mammal();
        obj1.move();
        //obj1.bark();
        obj1.eat();
        Dog obj2 = new Dog();
        obj2.bark();
    }
}