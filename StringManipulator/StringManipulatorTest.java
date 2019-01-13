public class StringManipulatorTest {
    public static void main(String[] args) {
        //Trim both input strings and then concatenate them. Return the new string.
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println("Trim and Concatinate string: "+str);   

        //Get the index of the character and return either the index or null. 
        //If the character appears multiple times, return the first index.   
        char letter = 'o';
        Integer a1 = manipulator.getIndexOrNull("Coding", letter);
        Integer b1 = manipulator.getIndexOrNull("Hello World", letter);
        Integer c1 = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a1); 
        System.out.println(b1); 
        System.out.println(c1);

        //Get the index of the start of the substring and return either the index or null. 
        String word1 = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a2 = manipulator.getIndexOrNull(word1, subString);
        Integer b2 = manipulator.getIndexOrNull(word1, notSubString);
        System.out.println(a2);
        System.out.println(b2); 
        
        //Get a substring using a starting and ending index, and 
        //concatenate that with the second string input to our method. 
        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2);
    }
}