class meat{
    meat(){
        System.out.println("There are many types of meat");
    }
}
class mutton extends meat {
    mutton(){
        System.out.println("This is red meat");
    }
}
class chicken extends mutton {
    chicken(){
        System.out.println("This is chicken meat");
    }
}

public class Food {
    public static void main(String[] args){
        chicken obj2 = new chicken();
    }
}
