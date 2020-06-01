public class BasicJavaTest {
    public static void main(final String[] args) {
        BasicJava.printTo255();
        BasicJava.printOddTo255();
        BasicJava.printSumTo255();
        int[] testArray = {-5,1,2,3,4,5};
        BasicJava.iterateArray(testArray);
        BasicJava.findMax(testArray);
        BasicJava.findAverage(testArray);
        BasicJava.arrayOddNumbers();
        BasicJava.countGreaterThanY(testArray, 3);
        BasicJava.squareArray(testArray);
        int[] testArray2 = {-1,-2,-3,1,2,3};
        BasicJava.removeNegativesArray(testArray2);
        int[] testArray3 = {1,2,3,4,5};
        BasicJava.arrayMaxMinAvg(testArray3);
        int[] testArray4 = {1,2,3,4,5};
        BasicJava.shiftArray(testArray4);
    }
}