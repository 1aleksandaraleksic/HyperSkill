package flashcards;

import java.util.ArrayList;
import java.util.Scanner;

class Card {
	String definition;
	String answer;
	
	public Card(String definition, String answer) {
		System.out.println("Objekat napravljen");
		this.definition = definition;
		this.answer = answer;
	}
	
	public static void checkEquals(String answer1, String answer2) {
		
		if(answer1.equalsIgnoreCase(answer2)) {
			System.out.println("Correct answer.");
		} else {
			System.out.println("Wrong answer. The correct one is: \""+answer1+"\".");
		}
	}
}

public class MainCard1Card2 {

	public static void main(String[] args) {
		String term;
        String definition;
        String answer;
        String answ;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input the number of cards: ");
        term = sc.nextLine();
        
        ArrayList<Card> array = new ArrayList<Card>();
        
        int n = Integer.parseInt(term.toString());
        
        for(int i =0;i<n;i++) {
        	 System.out.println("The card #"+(i+1)+":");
             definition = sc. nextLine();
             
             System.out.println("The definition of the card #"+(i+1)+":");
             answer = sc.nextLine();
             
            array.add(new Card(definition, answer));
        }
      	
        for(Card card: array) {
        	 System.out.println("Print the definition of \""+card.definition+"\":");
             answ = sc.nextLine();
             Card.checkEquals(card.answer, answ);
        }
                 
        sc.close();

	}
}
