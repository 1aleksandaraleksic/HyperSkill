package encryptionDecryption;
import java.util.*;

public class MainED {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String ed = sc.nextLine();
			
			String s = sc.nextLine();

			int key = sc.nextInt();
			
			String words = "abcdefghijklmnopqrstuvwxyz";

			if(isNumeric(s)) {
				if(key == 1 && ed.contentEquals("enc")) {
					String number = "0123456789";
					for (int i =0; i <s.length();i++) {
						for(int j = 0; j<number.length();j++) {
							if(number.charAt(j) == s.charAt(i)) {
								System.out.print(number.charAt(j+1));
							}
						}
					}
				}
				else if (key ==1 && ed.contentEquals("dec")) {
					String number = "0123456789";
					for (int i =0; i <s.length();i++) {
						for(int j = 0; j<number.length();j++) {
							if(number.charAt(j) == s.charAt(i)) {
								System.out.print(number.charAt(j-1));
							}
						}
					}
				}
			}else {
				if(ed.contentEquals("enc")) {
					encryption(key, s, words);
				} else if(ed.contentEquals("dec")) {
					decryption(key, s, words);
				}
			}
			
			sc.close();
		}
		
		public static boolean isNumeric(String str){
		    for (char c : str.toCharArray()){
		        if (!Character.isDigit(c)) return false;
		    }
		    return true;
		}
		
		public static void encryption (int key, String s, String words) {
			if(key == 5) {
				for(int i =0; i<s.length();i++) {
					if(s.charAt(i) == ' ') {
						System.out.print("%");
					} 
					else if(s.charAt(i) == 'W') {
						System.out.print("\\");
					} 
					else if(s.charAt(i) == '!') {
						System.out.print("&");
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
								System.out.print("~");
							}else if(j == 25) {
								System.out.print(words.charAt(4));
							}else {
								System.out.print(words.charAt(j+5));
							}
						} 
					}
				}
			
			} else if(key == 0) {
				System.out.println(s);
			}
		}
		
		public static void decryption (int key, String s, String words) {
			if(key == 5) {
				for(int i =0; i<s.length();i++) {
					if(s.charAt(i) == '%') {
						System.out.print(" ");
					} 
					else if(s.charAt(i) == '\\') {
						System.out.print("W");
					} 
					else if(s.charAt(i) == '&') {
						System.out.print("!");
					} 
					else if(s.charAt(i) == '~') {
						System.out.print("y");
					} 
					for(int j=0; j<words.length();j++) {
						if(s.charAt(i) == words.charAt(j)) {
							if(j == 0) {
								System.out.print(words.charAt(21));
							}else if(j == 1) {
								System.out.print(words.charAt(22));
							}else if(j == 2) {
								System.out.print(words.charAt(23));
							}else if(j == 4) {
								System.out.print(words.charAt(25));
							}else {
								System.out.print(words.charAt(j-5));
							}
						} 
					}
				}
			}
			else if(key == 0) {
				System.out.println(s);
			}
		}
	}

