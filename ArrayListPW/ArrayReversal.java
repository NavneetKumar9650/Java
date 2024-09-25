package ArrayListPW;

import java.util.*;


public class ArrayReversal {

      static HashMap<Character,Integer> makefreqMap = new HashMap<>(){
            HashMap <Character,Integer> mp = new HashMap<>();
            for(int i=0;i<str.length();i++){
                  Character ch = str.charAt(i);
                  if(!mp.containsKey(ch)){
                        mp.put(ch,1);
                  }else{
                        int currFreq = mp.get(ch);
                        mp.put(ch, currFreq+1);
                  }
            }
            return np;
      }




      public static boolean isAnagram(String s, String t){
            if(s.length() != t.length())return false;
            HashMap<Integer,Character> map1 = new HashMap<>();
            HashMap<Integer,Character> map2 = new HashMap<>();
            return map1.equals(map2);
      }


      public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ele = arr[i]%k;
            if(map.containsKey(ele)){
                  int freq = map.get(ele);
                  map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        for( int key: map.keySet()){
            int rem = k-key;
            if(!map.containsKey(rem)) return false;
            int keyFreq =map.get(key);
            int remFreq =map.get(rem);
            if(keyFreq !=remFreq)return false;
        }
        return true;
      }

      public static void main(String[] args) {
      //       int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
      //       int n = arr.length;

      //       // Print original array
      //       for (int ele : arr) {
      //             System.out.print(ele + " ");
      //       }
      //       System.out.println();

      //       // Reverse the array
      //       int i = 0, j = n - 1;
      //       while (i <= j) {
      //             int temp = arr[i];
      //             arr[i] = arr[j];
      //             arr[j] = temp;
      //             i++;
      //             j--;  // Decrement j
      //       }

      //       // Print reversed array
      //       for (int ele : arr) {
      //             System.out.print(ele + " ");
      //       }
      //       System.out.println();
      // }
}
}
