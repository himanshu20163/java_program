import java.util.*;
public class lower_upper_find_loop {
    
    public static Scanner scn = new Scanner(System.in);

    public static void find_string(String ans){
        char ch = ans.charAt(0);
        if(ch>='a' && ch<='z'){
           System.out.print("this string is Lower Case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.print("this string is Upper Case");
         }
    }
    public static void main(String[] args) {
        System.out.println("Enter A string");
        String str = scn.nextLine();
        find_string(str);
    }
}
