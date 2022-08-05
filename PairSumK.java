// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.util.*;

public class PairSumK {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

		int count = 0;
		for(int i = 0; i < arr.length; i++) {
		    for(int j = i+1; j < arr.length; j++) {
		        if(arr[i] + arr[j] == k) {
		            count++;
		        }
		    }
		}
		System.out.println(count);
        sc.close();
  }
}
