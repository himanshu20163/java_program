import java.util.*;
public class String_builder_split_program {
    
    public static Scanner scn = new Scanner(System.in);

    public static String alluppertolower(String str){

        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch =str.charAt(i);
            if(ch>='A'&& ch<='Z'){
                sb.append((char)(ch -'A' +'a'));
            }
            else{
               sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String Captial_title(String str){
        //1.2 se jayda charter hoto first letter captial 
        //1.2 2 se kam hoto unko lower case mei kar do 
        String[] arr = str.split(" ");// array form design 
        StringBuilder sb = new StringBuilder();// string builder design 
        int n =arr.length;// array length count
        for(int i=0;i<n;i++){
            String str2 = arr[i];//particulor har array ka charcter 
            if(str2.length()<=2){//2 se kam hoto unko lower case mei kar do 
                sb.append(alluppertolower(str2));
            }
            else{
                char ch=str2.charAt(0); //get a 0 value to str2 string 
                if(ch>='a'&& ch<='z'){
                    ch = (char)+(ch-'a'+'A');//index 0 value to convert upper case
                }
                sb.append(ch+alluppertolower(str2.substring(1)));// 0 index ch value 
                //with add 1 to str1 length value add 
            }
            if(i != n-1){ //space add in with array finished
                sb.append(" ");
            }    
        }
        return sb.toString();// stringbuilder convert to string
    }
    public static void main(String[] args) {
        String str = scn.nextLine();
        String ans=Captial_title(str);
        System.out.println(ans);    
    }
    
}
