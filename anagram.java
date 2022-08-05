import java.util.Scanner;

public class anagram {
     
    public static Scanner scn = new Scanner(System.in);
    public static String make_string(char ch, int i){
          //create stringBuilder and repeat string add
          StringBuilder sb = new StringBuilder();
          while(i-->0){
            sb.append(ch);
          }
          return sb.toString();
    }

    public static String sortString(String str){
       //1.array create 128 size
       //2.array store 0 and 1
       //3.stringbuilder create
       //4. string is greater than zero sb append with repeat charcter 
       int[] arr = new int[128];
       for(int i=0;i<str.length();i++){
          arr[str.charAt(i)]++;
       }
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<128;i++){
          if(arr[i]>0){
            sb.append(make_string((char) i , arr[i]));
          }
       }
       return sb.toString();
    }

    public static boolean anagram(String str1 , String str2){
        String s1=sortString(str1);
        String s2=sortString(str2);

        return s1.equals(s2);
    }

    public static boolean iequals(String s1 , String s2){
        //check two string length is equals and two string char is equals
        if(s1.length() != s2.length()){
            return false;
        }
        int n = s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    //    String ans = "himanshusahu";
    //    String ans1= sortString(ans);
    //    System.out.print(ans1);
          String s1 = scn.nextLine();
          String s2 = scn.nextLine();
          //Boolean ans = iequals(s1,s2);
          Boolean ans1 = anagram(s1,s2);
          System.out.println(ans1);
    }
}
