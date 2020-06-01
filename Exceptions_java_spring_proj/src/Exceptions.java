import java.util.ArrayList;
import java.util.Random;

class CantCastItemException extends Exception{}


public class Exceptions {
	ArrayList<Object> myList = new ArrayList<Object>();
	
	 public boolean deliverMessage() throws CantCastItemException{
	        Random r = new Random();
	        boolean hasGas = r.nextBoolean();
	        if (hasGas){
	            return true;
	        }
	        throw new CantCastItemException();
	    }
	}
	
	public Exceptions() {
		
	}
	
	public void testingExceptions(ArrayList<Object> testArrayList) {
		for(int i=0; i<testArrayList.size(); i++) {
			try {
			Integer castedValue = (Integer) testArrayList.get(i);
			} catch (CantCastItemException e){
				System.out.println("Unable to cast item into Integer");
			}
		}
		
	}

}
