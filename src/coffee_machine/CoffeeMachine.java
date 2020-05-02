package coffee_machine;

import java.util.Scanner;

public class CoffeeMachine {

	
	public static void main(String[] args) {
		
		int play = 1;
		Scanner sc = new Scanner(System.in);
		
		int water = 400;
		int milk = 540;
		int beans = 120;
		int cups = 9;
		int money = 550;
		
		do {

		System.out.println("Write action (buy, fill, take, remaining, exit):");
		String input = sc.nextLine();
		
		switch (input) {
			case "buy": 
				System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
				String choose = sc.nextLine();
					switch (choose) {
					case "1":
						int howManyCoffeeICanMake = 0;
						
						for(int i =0;i<1;i++) {
							if(water >= 250 && beans >= 16 && cups > 0) {
								water -= 250;
								beans -= 16;
								money += 4;
								cups -= 1;
								howManyCoffeeICanMake++;
							}else {
								break;
							}
						}
						
						if(howManyCoffeeICanMake>0) {
							System.out.println("I have enough resources, making you a coffee!");
						} else {
							if(water<250) {
								System.out.println("Sorry, not enough water!");
							} else if(beans<16) {
								System.out.println("Sorry, not enough beans!");
							}  else if(cups<1) {
								System.out.println("Sorry, not enough cups!");
							}
						}
						play = 2;
						break;
					case "2":
						
						int howManyCoffeeICanMake2 = 0;
						
						for(int i =0;i<1;i++) {
							if(water >= 350 && milk >= 75 && beans >= 20 && cups > 0) {
								water -= 350;
								milk -= 75;
								beans -= 20;
								money += 7;
								cups -= 1;
								howManyCoffeeICanMake2++;
							}else {
								break;
							}
						}
						
						if(howManyCoffeeICanMake2>0) {
							System.out.println("I have enough resources, making you a coffee!");
						} else {
							if(water<350) {
								System.out.println("Sorry, not enough water!");
							} else if(beans<20) {
								System.out.println("Sorry, not enough beans!");
							} else if(milk<75) {
								System.out.println("Sorry, not enough milk!");
							} else if(cups<1) {
								System.out.println("Sorry, not enough cups!");
							} 
						}
						
						play = 2;
						
						break;
					case "3": 
						int howManyCoffeeICanMake3 = 0;
						
						for(int i =0;i<1;i++) {
							if(water >= 200 && milk >= 100 && beans >= 12 && cups > 0) {
								water -= 200;
								milk -= 100;
								beans -= 12;
								money += 6;
								cups -= 1;
								howManyCoffeeICanMake3++;
							}else {
								break;
							}
						}
						
						if(howManyCoffeeICanMake3>0) {
							System.out.println("I have enough resources, making you a coffee!");
						} else {
							if(water<200) {
								System.out.println("Sorry, not enough water!");
							} else if(beans<12) {
								System.out.println("Sorry, not enough beans!");
							} else if(milk<100) {
								System.out.println("Sorry, not enough milk!");
							} else if(cups<1) {
								System.out.println("Sorry, not enough cups!");
							}
						}
						
						play = 2;
						break;
					case "back":
						play = 2;
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
				
				play = 2;
				break;
			case "take":
				System.out.println("I give you $"+money);
				money = 0;
				
				play = 2;
				break;
			case "remaining":
				status(water, milk, beans, cups, money);
				play = 2;
				break;
			case "exit":
				play = 0;
				break;
			default:
			
		}
				
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
