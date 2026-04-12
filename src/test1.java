static class test1 {
    void mark(){
        System.out.println("What is your mark?");
    }
    void dp(){
        System.out.println("What is your Dp?");
    }
}

class Overallmark extends test1{
    @Override void mark(){
        System.out.println("My mark is 80%");
    }
    void assignment(){
        System.out.println("My mark is 73");
    }
}

void main() {
    Overallmark obj = new Overallmark();
    obj.mark();
    obj.assignment();
    obj.dp();
}