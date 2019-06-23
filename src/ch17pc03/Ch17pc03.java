package ch17pc03;
import static ch17pc03.ObjectBinarySearcher.*;

/**
 * 
 * @author frank
 */
public class Ch17pc03 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] stringArray = {"beta", "gamma", "alpha", "epsilon", "delta"}; 
        String str = "epsilon"; 
        int result = binarySearch(stringArray, str); 
  
        if (result == -1) {
            System.out.println("Element not present"); 
        } else {
            System.out.println("Element found at " + "index " + result);
        }
    }

}
