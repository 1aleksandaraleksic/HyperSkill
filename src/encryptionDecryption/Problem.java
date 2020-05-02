package encryptionDecryption;

public class Problem {
    public static void main(String[] args){
        String [] array = {"+","10","20"};
        int i;
        if(array[0].equals("+")){
            int i1 = Integer.parseInt(array[1]);
            int i2 = Integer.parseInt(array[2]);
            i = i1+i2;
            System.out.println(i);
        } else if(array[0].equals("-")){
            int i1 = Integer.parseInt(array[1]);
            int i2 = Integer.parseInt(array[2]);
            i = i1-i2;
            System.out.println(i);
        } else if(array[0].equals("*")){
            int i1 = Integer.parseInt(array[1]);
            int i2 = Integer.parseInt(array[2]);
            i = i1*i2;
            System.out.println(i);
        }
    }
}
