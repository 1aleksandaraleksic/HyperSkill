package coffee_machine;

import java.util.Scanner;

public class HowManyCups {

	public static void main(String[] args) {
		
		int waterForOne = 200;
		int milkForOne = 50;
		int beansForOne = 15;
		
		int number;
		int water;
		int milk;
		int beans;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Write how many ml of water the coffee machine has:");
		water = sc.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		milk = sc.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		beans = sc.nextInt();
		System.out.println("Write how many cups of coffee you will need:");
		number = sc.nextInt();
		
		int howManyCoffeeICanMake = 0;
		
		for(int i =0; i<1000;i++) {
			if(water > waterForOne && milk > milkForOne && beans > beansForOne) {
				water = water -waterForOne;
				milk = milk - milkForOne;
				beans = beans - beansForOne;
				howManyCoffeeICanMake++;
			}else {
				break;
			}
		}
		
		System.out.println(howManyCoffeeICanMake);
		
		if(number == howManyCoffeeICanMake) {
			System.out.println("Yes, I can make that amount of coffee");
		} else if(number < howManyCoffeeICanMake) {
			System.out.println("Yes, I can make that amount of coffee (and even "+(howManyCoffeeICanMake-number)+" more than that)");
		}
		else {
			System.out.println("No, I can make only"+howManyCoffeeICanMake+" cup(s) of coffee");
		}
	}

}
