package FundamantalsOfJava;

public class Loops {
    public static void main(String[] args) {
        int x=0;
        int y=10;
        System.out.println("For loop");
        for(int i=0; i < y; i++){
            System.out.println(i);
        }
        System.out.println("While loops");
        int i=0;
        while(i++ < 10){
            System.out.println(i);
        }
        System.out.println("Do while");
        do {
            System.out.println(i);
        }
        while(i++ < 20);
    }
}
