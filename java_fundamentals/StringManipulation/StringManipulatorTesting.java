public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator.trimAndConcat("hello", "World");
        System.out.println(StringManipulator.getIndexorNull("hello", 'a'));
        System.out.println(StringManipulator.getIndexorNull("hello", "ell"));
        System.out.println(StringManipulator.concatSubstring("hello", 1, 2, "world"));
    }
}