package Courespw.Hashmpsss;

import java.util.*;

public class setIterate {
      public static void main(String[] args) {
            HashSet<Integer> st = new HashSet<>();
            int[] arr = { 4, 9, 2, 6, 8, 1 };
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
            HashSet<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(50);
            for (int ele : set) {
                  System.out.println(ele + " ");
            }
            System.out.println();
            set.clear();
            System.out.println(set);

      }

      public int countDistinctIntegers(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                  set.add(nums[i]);
                  set.add(reverse(nums[i]));
            }
            return set.size();

      }

      public int reverse(int n) {

            int r = 0;
            while (n != 0) {
                  r = r * 10 + n % 10;
                  n /= 10;
            }
            return r;
      }

      public int maximumNumberOfStringPairs(String[] words) {
            HashSet<String> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                  String rev = reverse(words[i]);
                  if (set.contains(rev)) {
                        count++;
                  } else {
                        set.add(words[i]);
                  }
                  return count;
            }

            return 0;

      }

      public String reverse(String s) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            return sb.toString();
      }

      public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> smap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                  char key = s.charAt(i);
                  if (smap.containsKey(key)) {
                        int freq = smap.get(key);
                        smap.put(key, freq + 1);
                  } else
                        smap.put(key, 1);
            }
            HashMap<Character, Integer> tmap = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                  char key = s.charAt(i);
                  if (tmap.containsKey(key)) {
                        int freq = tmap.get(key);
                        tmap.put(key, freq + 1);
                  } else
                        tmap.put(key, 1);
            }

            return false;

      }

      public int[] twoSum(int[] nums, int target) {
            int[] ans = { -1, 1 };
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                  int rem = target - nums[i];
                  if (map.containsKey(rem)) {
                        ans[0] = i;
                        ans[1] = map.get(rem);
                        break;
                  } else
                        map.put(nums[i], i);

            }
            return ans;
      }

      public boolean uniqueOccurrences(int[] arr) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int ele : arr) {
                  if (map.containsKey(ele)) {
                        int freq = map.get(ele);
                        map.put(ele, freq);
                  } else
                        map.put(ele, 1);
            }
            HashSet<Integer> set = new HashSet<>();
            for (int key : map.keySet()) {
                  int val = map.get(key);
                  set.add(val);
            }
            return (map.size() == set.size());
      }

      public int minExtraChar(String s, String[] dictionary) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int ele : arr) {
                  if (map.containsKey(ele)) {
                        int freq = map.get(ele);
                        map.put(ele, freq + 1);
                  } else
                        map.put(ele, 1);
            }

            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 100; i <= 999; i++) {
                  int x = i;
                  int c = x % 10;
                  x /= 10;
                  int b = x % 10;
                  x /= 10;
                  int a = x;

                  if (map.containsKey(a)) {
                        int aFreq = map.get(a);
                        map.put(a, aFreq - 1);
                        if(aFreq ==1) map.remove(a);
                        if (map.containsKey(b)) {

                              int bFreq = map.get(b);
                              map.put(b, bFreq - 1);
                              if(aFreq ==1) map.remove(a);

                              if (map.containsKey(c)) {
                                    ans.add(i);
                              }
                              map.put(b, bFreq);
                        }
                        map.put(a, aFreq);
                  }

            }
            int[]ans2 = new int[ans.size()];
            for(int i=0;i<ans2.length;i++){
                  ans2[i]= ans.get(i;)
            }
            return ans2;
      }

}
