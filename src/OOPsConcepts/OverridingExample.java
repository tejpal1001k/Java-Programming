package OOPsConcepts;

// Create the classes here
class Shape{
    int l,b;
    public void printMyType(){

    }
}
class Square extends Shape{
//    int l,b;
    Square(int l){
        this.l=l;
    }
    public void printMyType(){
        System.out.println("square");
        System.out.println(calculateArea());
    }
    public int calculateArea(){
        return l*l;
    }
}
class Rectangle extends Shape{
//    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void printMyType(){
        System.out.println("rectangle");
        System.out.println(calculateArea());

    }
    public int calculateArea(){
        return l*b;
    }
}

class OverridingExample {

    public static void main(String []args) {

        // Write your code here
        Shape s;
        s=new Rectangle(5,4);
        s.printMyType();
        s=new Square(5);
    }
}
