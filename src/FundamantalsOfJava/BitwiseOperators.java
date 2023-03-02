package FundamantalsOfJava;

public class BitwiseOperators {
    public static void main(String[] args) {
//        int x=20;
//        //bitwise left <<  shift 1 bit left and add 0 in right side
//        x=x<<2;
//        System.out.println(x);
//        // bitwise right >> shift element to right side and add 0 in left side
//        x=x>>2;
//        System.out.println(x);

        byte x,y;
            x=10;
            y=12;
            System.out.println ("~x="+(~x));
            System.out.println ("x & y="+(x&y));
            System.out.println ("x | y="+(x|y));
            System.out.println ("x ^ y="+(x^y)); //XOR
            System.out.println ("x<<2="+(x<<2));
            System.out.println ("x>>2="+(x>>2));
            System.out.println ("x>>>2="+(-1>>>2));
    }
}
