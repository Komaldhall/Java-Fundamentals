import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static ArrayList<Integer> printSumNumbers(int[] myArray, int num){
        int sum=0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i=0; i<myArray.length; i++){
            sum+=myArray[i]; 
            if(myArray[i]>num){
                newArray.add(myArray[i]);
            }           
        }
        System.out.println("Sum is: "+sum); 
        System.out.println("Sum is: "+newArray); 
        return newArray;
    }
    public static ArrayList<String> shuffleArray(String[] myArray){
        ArrayList<String> Array = new ArrayList<String>(Arrays.asList(myArray));
        Collections.shuffle(Array);
        System.out.println("Shuffled array is: "+Array);
        ArrayList<String> newArray = new ArrayList<String>();
        for(int i=0; i<myArray.length; i++){
            if(myArray[i].length()>5){
                newArray.add(myArray[i]);
            }        
        }
        return newArray;
    }
    public static void charAlpha(String myArray){
        char[] alphabet = myArray.toCharArray();
        System.out.println("Alphabetical array is: "+ Arrays.toString(alphabet));
        Character[] alpha = new Character[26];
        for(int i = 0; i < alphabet.length; i++) {
            alpha[i] = (Character) alphabet[i];
        }
        ArrayList<Character> ArrayChar = new ArrayList<Character>(Arrays.asList(alpha));
        Collections.shuffle(ArrayChar);
        System.out.println("Shuffled array is: "+ArrayChar);
        if(ArrayChar.get(0)=='a' || ArrayChar.get(0)=='e' || ArrayChar.get(0)=='i' || ArrayChar.get(0)=='o' || ArrayChar.get(0)=='u'){
            System.out.println("Oops! its a Vowel!!");
        }
        else{
            System.out.println("First letter is: "+ArrayChar.get(0));
        }
    }
    public static ArrayList<Integer> randomArray(int min, int max){
        Random random = new Random();
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 1; i <= 10 ; i++){
            newArray.add(random.nextInt(max - min) + min);
        }
        return newArray;
    }
    public static ArrayList<Integer> sortArray(ArrayList<Integer> myArray){
        Collections.sort(myArray);
        System.out.println("Minimum Number: "+myArray.get(0));
        System.out.println("Maximum Number: "+myArray.get(myArray.size()-1));
        return myArray;
    }
    public static void RandString(int len){

        String cand = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random= new Random();
        
        String newString=new String();
        for(int i=0; i<len; i++){
            int num = random.nextInt(51);
            char ch=cand.charAt(num);
            newString+=ch;
        }
        System.out.println("Random string is: "+newString);
    }
    public static void RandString(int len, int numb){

        String cand = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random= new Random();
        ArrayList<String> Array = new ArrayList<String>();
        for(int j=0; j<numb; j++){
        String newString=new String();
        for(int i=0; i<len; i++){
            int num = random.nextInt(51);
            char ch=cand.charAt(num);
            newString+=ch;
        }
        Array.add(newString);
        }
        
        System.out.println("Random string array is: "+Array);
    }
}