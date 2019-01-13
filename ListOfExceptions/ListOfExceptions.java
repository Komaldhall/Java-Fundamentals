import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
public class ListOfExceptions{
    public static void exceptionList(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            Integer castedValue = (Integer) myList.get(i);
        }
    }
    
}