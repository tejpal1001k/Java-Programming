package FundamantalsOfJava;

public class LogicalOperators {
    public static void main(String[] args) {
        /* logical operators
        1. AND && operator
        2. OR ||
        3. ! NOT
         */
        //AND
        if(2 > 0 && 3 > 0) {
            System.out.println("Both are true ");
        }else{
            System.out.println("One of them or both are false");
        }
// OR
        if(2 > 0 || 3 < 0) {
            System.out.println("one of them is true ");
        }else{
            System.out.println(" both are false");
        }
        // NOT
        if(2!=2){
            System.out.println("Condition True");
        }
        else{
            System.out.println("Condition false");
        }

    }
}
