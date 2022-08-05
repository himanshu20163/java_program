import java.util.*;
public class captialize_title {

    public static Scanner scn = new Scanner(System.in);

    public static String tolowercase(String str){//ABCDEF --> abcdef
          StringBuilder sb = new StringBuilder();
          int n = str.length();
          for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch >='A' && ch<='Z'){
                sb.append((char)(ch- 'A'+ 'a'));
            }
            else{
                sb.append(ch);
            }
          }
          return sb.toString();
    }

    public static String captial_string(String str){
        String[] arr = str.split(" ");//create a array of String
        StringBuilder sb = new StringBuilder();// create a StringBuilder
        int n = str.length();//no of string length
        for(int i=0;i<n;i++){
           String str0=arr[i];//index array fetch to str0
           if(str0.length()<=2){
              sb.append(tolowercase(str0));//append lower case charcter 
           }
           else{
            char ch = str0.charAt(0);//index 0 only captial 
            if(ch>='a' && ch<='z'){
                ch=(char) (ch-'A'+'a');
            }
            sb.append(ch+tolowercase(str.substring(1)));
           }
           if(i != n-1){
            sb.append(" ");
           }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = scn.nextLine();
        String ans = tolowercase(str);
        System.out.println(ans);
    }
}
