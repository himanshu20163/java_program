import java.util.*;
public class full_pyramid {
    //output
//      *  nsp=5;nst=1; nsp--;nst++
//     ***
//    *****
//   *******
//  *********
    public static Scanner scn = new Scanner(System.in);
    
    public static void full_pyramids(int n){
        int nsp=2*n,nst=1;
        for(int r=0;r<2*n;r++){
        for(int csp=1;csp<=nsp;csp++){
            System.out.print(" ");
        }
        for(int cst=1;cst<=nst;cst++){
            System.out.print("*");
        }
        if(r<n-1){
            nsp--;
            nst +=2;
        }
        else if(r>=n-1){
            nsp++;
            nst-=2;
        }
        System.out.println();
      }
    }


    public static void main(String[] args) {
       int n = scn.nextInt();
       full_pyramids(n);
    }
}
