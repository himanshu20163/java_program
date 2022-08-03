import java.util.*;
public class table_print {
 public static Scanner scn = new Scanner(System.in);

 public static void print_table(int n){
    for(int i=1;i<=10;i++){
        int m = n*i;
        System.out.println(n +" * "+ i + "="+ m);
    }
 }
    public static void main(String[] args) {
       System.out.println("Enter a Table Number");
      int n = scn.nextInt();
      print_table(n);
    }
    
}
