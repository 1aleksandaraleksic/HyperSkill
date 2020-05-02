package flashcards;

import java.util.Scanner;

public class TheLongestAscendingSequence {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	 
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	 
	        int max = 1;
	        for (int i = 1; i < n; i++) {
	            int best = 1;
	            while (i < n && arr[i] > arr[i - 1]) {
	                best++;
	                i++;
	            }
	            max = Math.max(max, best);
	        }
	 
	        System.out.println(max);
	    }

    }

  //  81 4 6 99 34 23 0 -1


