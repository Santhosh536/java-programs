package practice_java;


import java.util.*;

public class Enum {
    public static void main(String[] args) {
       
    	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter size of array: ");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter " + n + " elements:");

         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }

         System.out.println("Array elements are:");
         for (int num : arr) {
             System.out.println(num + " ");
         }

         sc.close();
         
         int left = 0;
         int right = arr.length - 1;

         while (left < right) {
             int temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;

             left++;
             right--;
         }

         // Print the array
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
    
    }
}
