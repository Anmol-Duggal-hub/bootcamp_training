
public class PuzzleJavaTest {
    public static void main(String[] args){
        int [] testArray = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        PuzzleJava.puzzleSumGreaterThan10(testArray);
        String [] testArray2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        PuzzleJava.puzzleShuffleNames(testArray2);
        char [] testArray3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        PuzzleJava.puzzleAlphabetShuffle(testArray3);
        PuzzleJava.randomIntArray();
        PuzzleJava.sortedRandomIntArray();
        PuzzleJava.randoString();
        PuzzleJava.randoStringArray();
    }
}