import java.util.*;
public class upper_lower_count {
     
    public static Scanner scn = new Scanner(System.in);

    public static int Upper_string(String str){
        char ch = str.charAt(0);
        int str_len = str.length(),count=0;
        for(int i=0;i<str_len;i++){
            if(ch >='A' && ch<='Z'){
              count++;  
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = scn.nextLine();
        int ans = Upper_string(str);
        System.out.println(ans);
    }
}
