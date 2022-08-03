import java.util.*;
public class Odd_Even_Program {
    public static Scanner scn = new Scanner(System.in);

    public static String odd_even(int n){
        if(n%2==0){//condition statment
            return "Your Number is Even";//return true value
        }
        return "Your Number is False";//return false value
    }
    public static void main(String[] args) {
       System.out.print("Enter Odd/Even Number");//print statment
       int n = scn.nextInt();//input statment
       String ans = odd_even(n);//store a String value
       System.out.print(ans);//print answer

    }
    
}
