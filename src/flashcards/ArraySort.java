package flashcards;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int [] elements = new int[size];
      
        for(int i =0;i<size;i++) {
        	elements[i]= sc.nextInt();
        }

        System.out.println(isAArraySorted(elements));
        sc.close();

	}
	
	public static boolean isAArraySorted(int [] array) {
		for(int i =0;i<array.length-1;i++) {
        	if(array[i] > array[i+1]) {
        		return false;
        	}
        }
		return true;
	}
}
