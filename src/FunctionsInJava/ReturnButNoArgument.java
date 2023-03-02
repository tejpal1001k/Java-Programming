package FunctionsInJava;

public class ReturnButNoArgument {
    static int sumOfnaturalNumber(){
        int n = 10;
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        int x= sumOfnaturalNumber();
        System.out.println(x);
    }
}
