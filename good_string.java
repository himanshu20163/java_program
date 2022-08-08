
public class good_string
{
    public static void sortString(String str) {
        int count =1, ans=0;
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;
        //String.valueOf(i);convert to String  
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
                ans = count++;
            }
            
        }
        System.out.println(sb.toString());
        System.out.println(ans);
      }
      
      public static void stringSorting_02(String str) {
          //single char count
        int count1 =1, ans1=0;
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;
        //String.valueOf(i);  
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
                ans1 = count1++;
            }
        }
          //double charter count
          int count=0;
        int[] freqArray = new int[128];

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freqArray[ch] = freqArray[ch] + 1;
            if(freqArray[ch] == 2){
                count++;  
            }
        }
        if(ans1==count){
            System.out.print("Good String");
        }
        else if(ans1!=count){
            System.out.print("Not a Good String");
        }
    }

	public static void main(String[] args) {
		String str ="aabb";
		stringSorting_02(str);
	}
}
