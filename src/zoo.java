class animal{
    animal(){
        System.out.println("So many animals in the zoo");
    }
}
class type extends animal{
    type() {
        System.out.println("There are different types of animals");
    }
}
class info extends type{
    info(){
        System.out.println("You can find out more information about animals at the Zoo");
    }
}

public class zoo{
    public static void main (String[]args){
        animal info = new info();
    }
}