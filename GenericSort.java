
package generics;

import static java.util.Arrays.sort;
import java.util.*;
import java.lang.*;

public class GenericSort {
    public static void main(String[] args){
        
        Integer[] intArray = {new Integer(2), new Integer(5), new Integer(8), new Integer(3)};
        Double[] doubleArray = {new Double(2.5), new Double(4.5), new Double(2.0)};
        Character[] charArray = {new Character('v'), new Character('t'), new Character('r')};
        String[] stringArray = {"Me", "Him", "Her", "Them"};
    
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        
        System.out.println("Sorted Integer Array: " + intArray);
        printList(intArray);
        System.out.println("Sorted double array: " + doubleArray);
        System.out.println("Sorted character array" + charArray);
        System.out.println("Sorted string array: " + stringArray);
        
    }
}
