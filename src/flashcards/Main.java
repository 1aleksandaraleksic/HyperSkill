package flashcards;

import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        int number = Integer.parseInt(str);
        Set<Integer> set = new TreeSet<Integer>();
        for(int i =1; i<number+1;i++) {
        	set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> tempSet = new TreeSet<Integer>();

    	for(int i =1;i<21;i++) {
    		if(i>10) {
    			set.remove(i);
    		}
    	}
    	return tempSet;
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
