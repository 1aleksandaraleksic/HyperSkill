package encryptionDecryption;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int key = sc.nextInt();
		
		String words = "abcdefghijklmnopqrstuvwxyz";
		
		if(key == 5) {
			for(int i =0; i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					System.out.print(" ");
				}
				for(int j=0; j<words.length();j++) {
					if(s.charAt(i) == words.charAt(j)) {
						if(j == 21) {
							System.out.print(words.charAt(0));
						}else if(j == 22) {
							System.out.print(words.charAt(1));
						}else if(j == 23) {
							System.out.print(words.charAt(2));
						}else if(j == 24) {
							System.out.print(words.charAt(3));
						}else if(j == 25) {
							System.out.print(words.charAt(4));
						}else {
							System.out.print(words.charAt(j+5));
						}
					} 
				}
			}
		} else if(key == 10) {
			for(int i =0; i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					System.out.print(" ");
				}
				for(int j=0; j<words.length();j++) {
					if(s.charAt(i) == words.charAt(j)) {
						if(j == 17) {
							System.out.print(words.charAt(1));
						}else if(j == 18) {
							System.out.print(words.charAt(2));
						}else if(j == 19) {
							System.out.print(words.charAt(3));
						}else if(j == 20) {
							System.out.print(words.charAt(4));
						}else if(j == 21) {
							System.out.print(words.charAt(5));
						}else if(j == 22) {
							System.out.print(words.charAt(6));
						}else if(j == 23) {
							System.out.print(words.charAt(7));
						}else if(j == 24) {
							System.out.print(words.charAt(8));
						}else if(j == 25) {
							System.out.print(words.charAt(9));
						}else {
							System.out.print(words.charAt(j+10));
						}
					} 
				}
			}
		}	else if(key == 12) {
			for(int i =0; i<s.length();i++) {
				if(s.charAt(i) == ' ') {
					System.out.print(" ");
				}
				for(int j=0; j<words.length();j++) {
					if(s.charAt(i) == words.charAt(j)) {
						if(j == 15) {
							System.out.print(words.charAt(1));
						}else if(j == 16) {
							System.out.print(words.charAt(2));
						}else if(j == 17) {
							System.out.print(words.charAt(3));
						}else if(j == 18) {
							System.out.print(words.charAt(4));
						}else if(j == 19) {
							System.out.print(words.charAt(5));
						}else if(j == 20) {
							System.out.print(words.charAt(6));
						}else if(j == 21) {
							System.out.print(words.charAt(7));
						}else if(j == 22) {
							System.out.print(words.charAt(8));
						}else if(j == 23) {
							System.out.print(words.charAt(9));
						}else if(j == 24) {
							System.out.print(words.charAt(10));
						}else if(j == 25) {
							System.out.print(words.charAt(11));
						}else {
							System.out.print(words.charAt(j+12));
						}
					} 
				}
			}
		}	
		sc.close();
	}
}