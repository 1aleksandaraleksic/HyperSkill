package flashcards;

import java.util.*;

public class MySet {

	public static void main(String[] args) {
        Set<Integer> set = getSetFromString("20");
		removeAllNumbersGreaterThan10(set);
        
		System.out.println(set);
	}

	public static Set<Integer> getSetFromString(String str) {
        int number = Integer.parseInt(str);
        Set<Integer> set = new TreeSet<Integer>();
        for(int i =1; i<number+1;i++) {
        	set.add(i);
        }
        System.out.println(set);
        return set;
    }
	

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
    	System.out.println(set.size());
    	Set<Integer> tempSet = new TreeSet<Integer>();

    	for(int i =1;i<set.size();i++) {
    		if(i>10) {
    			set.remove(i);
    		}
    	}
    	return tempSet;
    }
}
