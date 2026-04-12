static class test3{
    void mark(){
        System.out.println("What is your mark?");
    }
}
static class marks {
    void mark(){
        System.out.println("My mark is 80%");
    }
}
void main() {
       test3 x;
       marks y;

       y= new marks();
       y.mark();

       x = new test3();
       x.mark();
    }
