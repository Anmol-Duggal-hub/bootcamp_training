import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
    public static ArrayList<Integer> puzzleSumGreaterThan10(int[] intArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i=0; i<intArray.length; i++){
            sum+=intArray[i];
            if(intArray[i]>10){
                newArray.add(intArray[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
        return newArray;
    }

    public static ArrayList<String> puzzleShuffleNames(String[] stringArray){
        ArrayList<String> newArray = new ArrayList<String>();
        ArrayList<String> fiveArray = new ArrayList<String>();
        for(int i=0; i<stringArray.length; i++){
            newArray.add(stringArray[i]);
            if (stringArray[i].length()>5){
                fiveArray.add(stringArray[i]);
            }
        }
        Collections.shuffle(newArray);
        System.out.println(newArray);
        System.out.println(fiveArray);
        return newArray;
    }

    public static void puzzleAlphabetShuffle(char[] charArray){
        ArrayList<Character> newArray = new ArrayList<Character>();
        for (int i=0; i<charArray.length; i++){
            newArray.add(charArray[i]);
        }
        Collections.shuffle(newArray);
        System.out.println(newArray);
        System.out.println(newArray.get(0));
        System.out.println(newArray.get(newArray.size()-1));
        if (Arrays.asList('a','e','i','o','u').contains(newArray.get(0))){
            System.out.println("This is a vowel");
        }
    }

    public static ArrayList<Integer> randomIntArray(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            int ranNum = ThreadLocalRandom.current().nextInt(55,100+1);
            newArray.add(ranNum);
        }
        System.out.println(newArray);
        return newArray;
    }


    public static ArrayList<Integer> sortedRandomIntArray(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            int ranNum = ThreadLocalRandom.current().nextInt(55,100+1);
            newArray.add(ranNum);
        }
        Collections.sort(newArray);
        System.out.println(newArray);
        System.out.println(Collections.min(newArray));
        System.out.println(Collections.max(newArray));
        return newArray;
    }

    public static String randoString(){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(5);
        for (int i = 0; i < 5; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static ArrayList<String> randoStringArray(){
        ArrayList<String> newArray = new ArrayList<String>();
        for(int i=0; i<10; i++){
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvxyz";

            StringBuilder sb = new StringBuilder(5);
            for (int j = 0; j < 5; j++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
            }
            newArray.add(sb.toString());
        }
        System.out.println(newArray);
        return newArray;
    }

}