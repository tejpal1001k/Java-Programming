package FunctionsInJava;

public class NoReturnSingleArgument {
    public static void tableOfX(int x){
        int i=1;
        while(i <10){
            System.out.println(10*i);
            i++;
        }
    }
    public static void main(String[] args) {
        int x=10;
        //print table of x;
        tableOfX(x);
    }
}
