package ArrayListPW;

import java.util.Arrays;

public class builtInMethod {
      public static void main(String[] args) {
            int []arr={30,10,40,23,56};
            for(int ele:arr){
                  System.out.println(ele + " ");
            }
            Arrays.sort(arr);
            System.out.println();
            for(int i=0;i<arr.length;i++){
                  System.out.println(arr[i]+ " ");
            }
      }
}
