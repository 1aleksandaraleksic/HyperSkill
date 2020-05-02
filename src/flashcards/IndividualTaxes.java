package flashcards;

import java.util.Scanner;

public class IndividualTaxes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int nC = scanner.nextInt();
        
        int [][] arr = new int [2][nC];
        
        for(int i =0; i<nC;i++) {
        	arr[0][i]= scanner.nextInt();
        }
        for(int i =0; i<nC;i++) {
        	arr[1][i]= scanner.nextInt();
        }

        int max =0;
        for(int i =0;i<nC;i++) {
        	try {
        		if((arr[0][i]/arr[1][i])*100>max && arr[0][i] !=0) {
            		max = (arr[0][i]/arr[1][i])*100;
            	}
			} catch (Exception e) {
				// TODO: handle exception
			}
        	
        }

        System.out.println(max);
        int n = 0;
        for(int i=0;i<nC;i++) {
        	try {
        		if((arr[0][i]/arr[1][i])*100 == max) {
            		n = i+1;
            	}
			} catch (Exception e) {
				// TODO: handle exception
			}
        	
        }      
      
        System.out.println(n);

        scanner.close();
	}

}
// System.out.println(Arrays.deepToString(arr));

