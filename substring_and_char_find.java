import java.util.*;
public class substring_find {
 public static Scanner scn = new Scanner(System.in);
    public static void test3() {
        String str = "abcdefghi";
        String str1 = str.substring(1,6+1);
        //System.out.println(str1.charAt(4));
        System.out.println(str1);
    }

    public static void allSubstrings(String str ){
        for(int i = 0;i < str.length();i++){
            for(int j = i; j < str.length();j++){
                // System.out.print("(" + i + ", " + (j + 1) + ") ");
                System.out.println(str.substring(i, j + 1));
            }
            System.out.println();
        }
    }

    public static int countchar(String str ,char ch ){
        int count=0,n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)== ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //test3();
        //allSubstrings("abcd");
        String str = scn.nextLine();//take a string
        char ch = scn.next().charAt(0);//take a single character 
        int ans = countchar(str,ch);//ans variable store a value 
        System.out.println(ans);//print the output
    }
}
