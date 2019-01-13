public class BasicJavaTest {
    public static void main(String[] args) {
        //Write a method that prints all the numbers from 1 to 255.
        BasicJava basic = new BasicJava();
        basic.printAllNumbers();
        //Write a method that prints all the odd numbers from 1 to 255.
        basic.printOddNumbers();
        //Write a method that prints the numbers from 0 to 255
        basic.printSumNumbers();
        //Given an array X, say [1,3,5,7,9,13], 
        //write a method that would iterate through each member of the array and print each value on the screen. 
        int[] myArray = {1,3,5,7,9,13};
        basic.printArrayNumbers(myArray);
        //Write a method (sets of instructions) that takes any array and 
        //prints the maximum value in the array. 
        //Your method should also work with a given array that has 
        //all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
        int[] myArray1 = {1,3,5,7,9,13};
        int[] myArray2 = {-3, -5, -7};
        basic.printMaxNumbers(myArray1);
        basic.printMaxNumbers(myArray2);
        //Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an 
        //array [2, 10, 3], your method should print an average of 5. 
        int[] myArray3 = {1,3,5,7,9,13};
        int[] myArray4 = {-3, -5, -7, -4};
        basic.printAvgNumbers(myArray3);
        basic.printAvgNumbers(myArray4);
        //Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. 
        //When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].
        basic.oddArray();
        //Write a method that takes an array and returns the number of values in that array whose value is greater 
        //than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 
        //2 (since there are two values in the array that are greater than 3).
        int[] myArray5 = {1,3,5,7,9,13};
        int num=6;
        basic.bigValueArray(myArray5,num);
        //Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. 
        //When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
        int[] myArray6 = {1,3,5,7,9,13};
        int[] myArray7 = {1, 5, 10, -2};
        basic.squareArray(myArray6);
        basic.squareArray(myArray7);
        //Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. 
        //When the method is done, x should have no negative values, say [1, 5, 10, 0].
        int[] myArray8 = {1, 5, 10, -2};
        basic.eliNegNum(myArray8);
        //Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, 
        //the minimum value in the array, and the average of the values in the array. The returned array should be three 
        //elements long and contain: [MAXNUM, MINNUM, AVG]
        int[] myArray9 = {1, 5, 10, -2};
        basic.maxMinAvgNum(myArray9);
        //Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. 
        //For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
        int[] myArray10 = {1, 5, 10, -2};
        basic.shiftArray(myArray10);
   
    }
}