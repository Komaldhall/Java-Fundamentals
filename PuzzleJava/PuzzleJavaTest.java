import java.util.Arrays;
import java.util.ArrayList;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
        //Print the sum of all numbers in the array. Also have the function return 
        //an array that only includes numbers that are greater than 10 (e.g. 
        //when you pass the array above, it should return an array with the values of 13,25,32)
        int[] myArray={3,5,1,2,7,9,8,13,25,32};
        int num=10;
        PuzzleJava puzzle = new PuzzleJava();
        ArrayList<Integer> puz = puzzle.printSumNumbers(myArray, num);
        System.out.println("New Array is: "+puz); 
        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, 
        //Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method 
        //also return an array with names that are longer than 5 characters.
        String[] myArray1={"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> shuffle = puzzle.shuffleArray(myArray1);
        System.out.println("Array with names longer than 5 characters is: "+shuffle); 
        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
        //Shuffle the array and display the last letter of the array. Have it also display the first letter of the array. 
        //If the first letter in the array is a vowel, have it display a message
        String alpha="abcdefghijklmnopqrstuvwxyz";
        puzzle.charAlpha(alpha);
        //Generate and return an array with 10 random numbers between 55-100.
        int min=10;
        int max=100;
        ArrayList<Integer> rand = puzzle.randomArray(min, max);
        System.out.println("Random Number: "+rand);
        //Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
        //(showing the smallest number in the beginning). Display all the numbers in the array. Next, 
        //display the minimum value in the array as well as the maximum value.
        ArrayList<Integer> sort = puzzle.sortArray(rand);
        System.out.println(sort);
        //Create a random string that is 5 characters long.
        int len=5;
        puzzle.RandString(len);
        //Generate an array with 10 random strings that are each 5 characters long
        int numb=10;
        puzzle.RandString(len, num);
















    }   

}