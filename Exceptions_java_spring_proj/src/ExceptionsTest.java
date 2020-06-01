import java.util.ArrayList;

public class ExceptionsTest {

	public static void main(String[] args) {
		Exceptions testingExceptions = new Exceptions();
		testingExceptions.myList.add("13");
		testingExceptions.myList.add("hello world");
		testingExceptions.myList.add(48);
		testingExceptions.myList.add("Goodbye World");
		testingExceptions.testingExceptions(testingExceptions.myList);

	}

}
