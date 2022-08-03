import java.util.*;
public class gratest_number {
    public static Scanner scn = new Scanner(System.in);

    public static int gratest_number(int a ,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.print("Enter a  Number");
         int a = scn.nextInt();
         int b = scn.nextInt();
         int c = scn.nextInt();
         int ans = gratest_number(a,b,c);
         System.out.print(ans);
    }
}
