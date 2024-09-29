package Recursion;

import java.util.Arrays;

public class question {
      public static void leftRotated(int arr[], int n, int d) {
            if (n == 0)
                  return;
            d = d % n;
            if (d != 0) {
                  int[] temp = new int[d];
                  // step 1 for taking a frist arrya
                  for (int i = 0; i < d; i++) {
                        temp[i] = arr[i];

                  }
                  // step2
                  for (int i = d; i < n; i++) {
                        arr[i - d] = arr[i];

                  }

                  for (int i = n - d; i < n; i++) {
                        arr[i] = temp[i - (n - d)];

                  }
            }

      }

      public static void revers(int arr[], int start, int end) {
            while (start <= end) {
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }
      }

      public static void leftotated(int arr[], int n, int d) {
            if (n == 0)
                  return;
            d = d % n;
            revers(arr, 0, d - 1);
            revers(arr, d, n - 1);
            revers(arr, 0, n - 1);
      }

      public class MergeSort {

            // Method to perform merge sort on the array
            public static int[] mergeSort(int[] arr) {
                if (arr.length <= 1) {
                    return arr;
                }
                int mid = arr.length / 2;
        
                // Split the array into two halves
                int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
                int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
                // Merge the sorted halves
                return merge(left, right);
            }
        
            // Method to merge two sorted arrays
            private static int[] merge(int[] left, int[] right) {
                int[] merged = new int[left.length + right.length];
                int i = 0, j = 0, k = 0;
        
                // Merge the two arrays
                while (i < left.length && j < right.length) {
                    if (left[i] <= right[j]) {
                        merged[k] = left[i];
                        i++;
                    } else {
                        merged[k] = right[j];
                        j++;
                    }
                    k++;
                }
        
                // Copy any remaining elements from left
                while (i < left.length) {
                    merged[k] = left[i];
                    i++;
                    k++;
                }
        
                // Copy any remaining elements from right
                while (j < right.length) {
                    merged[k] = right[j];
                    j++;
                    k++;
                }
        
                return merged;
            }
        
            public static void main(String[] args) {
                int[] arr = { 5, 4, 3, 2, 1 };
                arr = mergeSort(arr);
                System.out.println("Sorted array: " + Arrays.toString(arr));
            }
        } 
      }