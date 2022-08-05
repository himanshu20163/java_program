import java.util.*;
public class reverse_string_statement {
    
    public static Scanner scn = new Scanner(System.in);

    public static void swap_string(String[] arr,int i, int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
         
    }


    public static void swap_char(char[] str,int i, int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;        
    }

    public static void reverse_array(String[] arr){
        int n=0,m=arr.length-1;
        while(n<m){
            swap_string(arr,n++,m--);
        }
       
    }

    // public static void reverse_String_arr(String[] arr){
        
    // }
    
    public static String Reverse_Statement(String str){//this is himanshu
       String[] arr = str.split(" ");// this ->0 is->1 himanshu->2
       reverse_array(arr);// himanshu->0 is->1 this->2
       int n =arr.length;//3
       StringBuilder sb = new StringBuilder();//sb= himanshu_is_
      // String ans =reverse_String(str);
       for(int i=0;i<n;i++){//1<3
        sb.append(arr[i]);
        if( i != n-1){//1 != 2
            sb.append("_");
        }
       }
       return sb.toString();
    }


    public static String reverse_String(String str){
        char[] arr = str.toCharArray();
        int n =str.length(),i=0,m=n-1;
        while(i<m){
            swap_char(arr,i++,m--);
        }

        StringBuilder sb = new StringBuilder();
        for(char ch :arr){
            sb.append(ch);
        }
        return sb.toString();

    }

    public static String make_string(char ch , int freq){
          StringBuilder sb = new StringBuilder();
          while(freq--> 0){//same char store in sb string 
            sb.append(ch);
          }
       return sb.toString();// return the string
    }

    public static String reverse_1(String str){//bcaabab
        int[] freqarray=new int[128];//frequency create array
        StringBuilder sb = new StringBuilder();
        int n=str.length();// string length
        for(int i=0;i<n;i++){//string length times loop
            char ch = str.charAt(i);//one by one charcter get to ch variable 
            freqarray[ch]=freqarray[ch]+1;//index value store times of i
        }
        for(int i=0;i<128;i++){//128 times loops
            if(freqarray[i]>0){//ascii value check greater than zero
                sb.append(make_string((char)i,freqarray[i]));//append make_string ch and i times value 
            }//aaabbbc
        }
        return sb.toString();// return the value 
    }
    public static void main(String[] args) {
        String str = scn.nextLine();
        String ans = Reverse_Statement(str);
        String ans1 = reverse_String(str);
        System.out.print(ans);
        System.out.print(ans1);
        }   
}
