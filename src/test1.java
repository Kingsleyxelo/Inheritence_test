static class test1 {
    void marks(){
        System.out.println("What is your mark?");
    }
}

static class mark extends test1 {
    void marks(){
        System.out.println("80%");
    }
}

void main() {
    test1 x;
    test1 y;

    y = new test1();
    y.marks();

    x = new mark();
    x.marks();
}