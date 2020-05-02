package encryptionDecryption;
import java.util.*;
import java.util.stream.Collectors;

public class MainFirstAndLastArray {

	public static int[] getFirstAndLast(int[] array){	

		int [] arr = {array [0],array[array.length-1]};

		return arr;        
    }

    /* Do not change code below */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
