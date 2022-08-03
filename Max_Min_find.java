import java.util.Scanner;

public class Max_Min_find {
    public static Scanner scn = new Scanner(System.in);

    public static int Max_num(int n){
        int max_ele=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int max_no =scn.nextInt();
            if(max_no>max_ele){
                max_ele=max_no; 
            }
        }
        return max_ele;
    }

    public static int Min_num(int n){
        int min_ele=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int min_no =scn.nextInt();//10 20 30 40 50
            if(min_no<min_ele){//20<50
                min_ele=min_no; //min_ele=10
            }
        }
        return min_ele;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        //int ans = Max_num(n);
        int ans1 = Min_num(n);
        System.out.print(ans1);
        
    }
}
