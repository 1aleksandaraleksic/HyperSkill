package coffee_machine;

import java.util.Scanner;

public class BuyFillTake {

	public static void main(String[] args) {
		
		int play = 1;
		Scanner sc = new Scanner(System.in);
		do {
		int water = 1200;
		int milk = 540;
		int beans = 120;
		int cups = 9;
		int money = 550;
		
		status(water, milk, beans, cups, money);
	
		System.out.println("Write action (buy, fill, take):");
		String input = sc.nextLine();
		
		switch (input) {
			case "buy": 
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
				int choose = sc.nextInt();
					switch (choose) {
					case 1:
						water -= 250;
						beans -= 16;
						money += 4;
						cups -= 1;
						break;
					case 2:
						water -= 350;
						milk -= 75;
						beans -= 20;
						money += 7;
						cups -= 1;
						break;
					case 3: 
						water -= 200;
						milk -= 100;
						beans -= 12;
						money += 6;
						cups -= 1;
						break;
					}
				break;
			case "fill":
				System.out.println("Write how many ml of water do you want to add: ");
				int waterInput = sc.nextInt();
				water += waterInput;
				
				System.out.println("Write how many ml of milk do you want to add: ");
				int milkInput = sc.nextInt();
				milk += milkInput;
				
				System.out.println("Write how many grams of coffee beans do you want to add: ");
				int beansInput = sc.nextInt();
				beans += beansInput;
				
				System.out.println("Write how many disposable cups of coffee do you want to add:");
				int cupsInput = sc.nextInt();
				cups += cupsInput;
				break;
			case "take":
				System.out.println("I give you $"+money);
				money = 0;
				break;
			default:
			
		}
		
		status(water, milk, beans, cups, money);
		
		}while(play!=0);
		sc.close();

	}
	
	public static void status (int water, int milk, int beans, int cups, int money) {
		System.out.println("The coffee machine has:");
		System.out.println("	"+water+" of water");
		System.out.println("	"+milk+" of milk");
		System.out.println("	"+beans+" of coffee beans");
		System.out.println("	"+cups+" of disposable cups");
		System.out.println("	"+money+" of money");
	}

}
