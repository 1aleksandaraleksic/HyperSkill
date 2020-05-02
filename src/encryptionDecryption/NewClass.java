package encryptionDecryption;

public class NewClass {
//	Write a method that tests the given number is composite or not. The composite number is a positive integer that has at least one divisor other than 1 and itself.
//
//	The method should return a value of the boolean type.
//	Sample Input 1:
//
//	1
//	Sample Output 1:
//
//	false
//	Sample Input 2:
//
//	2
//	Sample Output 2:
//
//	false
//	Sample Input 3:
//
//	4
//	Sample Output 3:
//
//	true

 public static void main(String[] args) {
	 
	 System.out.println(isComposite(4));
	 
 }
 
 public static boolean isComposite(long number) {
	 int count =0;
	 for(int i = 1; i<number;i++) {
		 if(i == number || i ==1) {
			 
		 }
		 else if(number % i == 0) {
			 count++;
		 }
	 }

	 if(count !=0) {
		 return true;
	 }else {
		 return false;
	 }
 }

	public static long sumInRange(int from, int to) {
	    int subtraction = to - from;
	    int division = subtraction /2;
	    
	    int sum = division+from;
	    long sumL = sum*subtraction;
	    
	    return sumL;
	}
}