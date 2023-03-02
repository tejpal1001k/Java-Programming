package FundamantalsOfJava;

public class SwitchCase {
    public static void main(String[] args) {
        int x=50;
        switch(x){
            case 0: {
                System.out.println("condition match and output is 0");
                break;
            }
            case 1: {
                System.out.println("condition match and output is 1");
                break;
            }
            case 2: {
                System.out.println("condition match and output is 2");
                break;
            }


            // if i will not use break after every statements then the every statements will execute
            // and where i use break the code till terminate the case
            case 4:{
                System.out.println(" hy i ma 4 ");
            }
            case 5:{
                System.out.println(" hy i ma 5 ");
                break;
            }
            case 6:{
                System.out.println(" hy i ma 6 ");
            }
            // always use default in the end of the all the cases.
            default:{
                System.out.println("If no condition match then default will execute");
//                break;
            }
        }
    }
}
