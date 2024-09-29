package ArrayListPW;

import java.util.HashMap;

public class ArrayReversal {

    // Method to create a frequency map of characters from a string
    public static HashMap<Character, Integer> makefreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq + 1);
            }
        }
        return mp;
    }

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = makefreqMap(s);
        HashMap<Character, Integer> map2 = makefreqMap(t);

        return map1.equals(map2);  // Compare both frequency maps
    }

    // Method to check if an array can be arranged in pairs divisible by k
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int ele = ((arr[i] % k) + k) % k;  // Handle negative remainders
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (key == 0) {  // Special case for remainder 0
                if (freq % 2 != 0) return false;
            } else {
                int rem = (k - key) % k;  // Complement remainder
                if (!map.containsKey(rem) || map.get(rem) != freq) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countNicePairs(int[] nums) {
 int count = 0;
 int n= nums.length;
 HashMap<Integer, Integer>map = new HashMap<>();
 for(int i=0;i<n-1;i++){
int ele = nums[i]- rev(nums[i]);
if(map.containsKey(ele)){
    int freq =map.get(ele);
    count += freq;
    map.put(ele,freq+1);
}
else map.put(ele,1);
 }
        return count;
        
    }
     
    public static int rev(int n){
        int r=0;
        while (n!=0) {
            r= r*10 +n%10;
            n /= 10;
        }
        return r;
    }


    public static void main(String[] args) {
        // Example usage of isAnagram method
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));  // Output: true

        // Example usage of canArrange method
        ArrayReversal ar = new ArrayReversal();
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        System.out.println(ar.canArrange(arr, k));  // Output: true
    }
}
