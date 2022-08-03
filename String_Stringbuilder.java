import java.util.*;
public class String_Stringbuilder {

    public static Scanner scn = new Scanner(System.in);

    public static void string_test(){//1 12 123 1234 123456 123456 ...../ 99
        //O(N + M) m no of character   N  
        String str=" ";//blank string
        for(int i=0;i<100;i++){
            str +=i;
        }
        System.out.println(str+" ");
        
    }
    public static void stringbuilder_test(){//12345678910111213141516..../99
        //O(M)
        StringBuilder str = new StringBuilder();//blank string
        for(int i=0;i<100;i++){
            str.append(i);
        }
        System.out.println(str);
        
    }
    public static void main(String[] args) {
        string_test();
        //stringbuilder_test();
    }
    
}
