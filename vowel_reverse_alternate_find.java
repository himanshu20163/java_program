import java.util.*; 
public class vowel_reverse_alternate_find {

    public static Scanner scn = new Scanner(System.in);
    
    public static int small_char(String str){
        int len = str.length(),count=0;
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
    return count;
    }

    public static int const_count(String str){
        int len = str.length();
        return len-small_char(str);
    }

    public static void reverse_string(String str){//himanshu  --> uhsnamih
        int len = str.length();//i=7 
        for(int i=len-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void alternate_string(String str){//himanshu  --> uhsnamih
        int len = str.length();//i=7
        for(int i=0;i<len;i +=2){//0<7
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
       String str = scn.nextLine();
       //int ans = const_count(str);
      // System.out.print(ans);
      //reverse_string(str);
      alternate_string(str);
    }

}
