package assignmentThree;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int x = 60;

        if( x == 40 ) {
            System.out.print("Pass");
        }else if( x == 50 ) {
            System.out.print("C");
        }else if( x == 60 ) {
            System.out.print("B");
        }else if( x == 70 ) {
            System.out.print("A");
        }else if( x == 80 ) {
            System.out.print("A+");
        }else {
            System.out.print("Fail");
        }
    }
}
