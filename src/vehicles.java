class Parent {
    Parent() { System.out.print("Parent "); }
}

class Child extends Parent {
    Child() { System.out.print("Child"); }

    public static void main(String[] args) {
       Child obj = new Child();
    }
}