package coffee_machine;

import java.util.Scanner;

public class SwitchRCT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		switch (input) {
		case "triangle":
			double aT = sc.nextDouble();
			double bT = sc.nextDouble();
			double cT = sc.nextDouble();
			double sumT = (aT + bT + cT)/2;
			double area = Math.sqrt(sumT*(sumT-aT)*(sumT-bT)*(sumT-cT));
			System.out.println(area);
			break;
		
		case "rectangle":
			double aR = sc.nextDouble();
			double bR = sc.nextDouble();
			double sumR = aR * bR;
			
			System.out.println(sumR);
			break;
		
		case "circle":
			double radius = sc.nextDouble();
			double sumC = radius * radius * Math.PI;
			System.out.println(sumC);
			break;
		
		default:
			System.out.println("error!");
		}
		sc.close();
	}

}
