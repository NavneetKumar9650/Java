package ArrayListPW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class second {
      public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // System.out.println("ENter the number of arr");
            // int n = sc.nextInt();
            // int[] arr = new int[n];

            // for (int i = 0; i <= n; i++) {
            // arr[i] = sc.nextInt();
            // }
            // for (int i = 0; i <= n; i++) {
            // System.out.println(arr[i]);
            // }

            // second way of doning it

            // int[]arr = {10, 20, 30 ,40,50};
            // int n =arr.length;
            // for(int i=0; i<n;i++){
            // System.out.println(arr[i]+ " ");
            // }

            Scanner sc = new Scanner(System.in);
            int[] arr = { 10, 55, 45, 75, 85, 96, 25, 14, 5, };
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  if (arr[i] < 35)
                        System.out.print(i + " ");
            }

      }

      public int lengthOfLongestSubstring(String s) {

            int n = s.length();
            if(n<=1)return n;
            int maxLen =0;
            int i=0,j=0;
            HashMap<Character,Integer> map = new HashMap<>();
            while (j<n) {
                  char ch = s.charAt(j);
                  if(map.containsKey(ch) && map.get(ch)>=i){
                        int len = j-1;
                        maxLen = Math.max(maxLen,len);
                        while (s.charAt(i)!=ch) i++;
                        i++;
                  }
                   map.put(ch,j);
                  j++;
            }
            return 0;
        
      }


       public static void frequencyCount(int arr[], int n, int P) {
        Map<Integer, Integer> map = new HashMap<>();
        
        
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                
            }else{
                map.put(arr[i], 1);
            }
        }
         
        for(int i = 0; i< arr.length; i++){
            arr[i] = 0;
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey()<=n){
                arr[entry.getKey()-1] = entry.getValue();
            }
        }
        
}
   

public boolean canArrange(int[] arr, int k) {


    HashMap<Integer, Integer>map = new HashMap<>();
    for(int i=0;i<)
    return false;
        
}


}
 






