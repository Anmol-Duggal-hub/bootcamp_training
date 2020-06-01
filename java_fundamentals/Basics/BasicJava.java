import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {

    public static void printTo255(){
        int i = 0;
        while(i<=255){
            System.out.println(i);
            i++;
        }

    }

    public static void printOddTo255(){
        int i = 0;
        while(i<=255){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printSumTo255(){
        int i=0;
        int sum=0;
        while(i<=255){
            System.out.println(i);
            sum += i;
            System.out.println(sum);
            i++;
        }
    }

    public static void iterateArray(int[] intArray){
        for (int i=0;i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static int findMax(int[] intArray){
        int max = intArray[0];
        for(int i=1;i<intArray.length;i++){
            if (max<intArray[i]){
                max = intArray[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static int findAverage(int[] intArray){
        int sum = 0;
        int avg = 0;
        for(int i=0;i<intArray.length;i++){
            sum+=intArray[i];
        }
        avg = sum/intArray.length;
        System.out.println(avg);
        return avg;
    }

    public static  ArrayList<Integer> arrayOddNumbers(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i=0; i<=255; i++){
            if(i%2!=0){
               newArray.add(i);
            }
        }
        System.out.println(newArray);
        return newArray;
    }

    public static int countGreaterThanY(int[] intArray, int y){
        int counter = 0;
        for(int i=0;i<intArray.length;i++){
            if(y<intArray[i]){
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static int[] squareArray(int[] intArray){
        for(int i=0; i<intArray.length;i++){
            intArray[i] = (int)Math.pow(intArray[i],2);
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public static int[] removeNegativesArray(int[] intArray){
        for(int i=0; i<intArray.length; i++){
            if (intArray[i] < 0){
                intArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public static  ArrayList<Integer> arrayMaxMinAvg(int[] intArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int maxnum = intArray[0];
        int minnum = intArray[0];
        int sum = 0;
        int avg = 0;
        for (int i=0; i<intArray.length; i++){
            sum+=intArray[i];
        }
        avg = sum/intArray.length;
        for (int i=1;i<intArray.length; i++){
            if(maxnum<intArray[i]){
                maxnum = intArray[i];
            }
            if(minnum>intArray[i]){
                minnum = intArray[i];
            }
        }
        newArray.add(maxnum);
        newArray.add(minnum);
        newArray.add(avg);
        System.out.println(newArray);
        return newArray;
    }

    public static ArrayList<Integer> shiftArray(int[] intArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i=1; i<intArray.length; i++){
            newArray.add(intArray[i]);
        }
        newArray.add(0);
        System.out.println(newArray);
        return newArray;
    }
}