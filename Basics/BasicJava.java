import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
    public static void printAllNumbers(){
        for(int i=1; i<256; i++){
            System.out.println(i);   
        }
    }
    public static void printOddNumbers(){
        for(int i=1; i<256; i+=2){
            System.out.println(i);   
        }
    }
    public static void printSumNumbers(){
        int s=0;
        for(int i=1; i<256; i++){
            s+=i;
            System.out.println("New number: "+i+" Sum: "+s);   
        }
    }
    public static void printArrayNumbers(int[] myArray){
        
        for(int i : myArray){
            System.out.println(i);   
        }
    }
    public static void printMaxNumbers(int[] myArray){
        int max=myArray[0];
        for(int i=0; i<myArray.length; i++){
            if(max < myArray[i]){
                max = myArray[i];
            }    
        }
        System.out.println("Maximum value is: "+max); 
    }
    public static void printAvgNumbers(int[] myArray){
        int sum=0;
        for(int i=0; i<myArray.length; i++){
            sum+=myArray[i];                
        }
        double avg=(double)sum/myArray.length;
        System.out.println("Average value is: "+avg); 
    }
    public static void oddArray(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1; i<256; i+=2){
            myArray.add(i);                
        }
        
        System.out.println("Odd array is: "+myArray); 
    }
    public static void bigValueArray(int[] myArray, int num){
        int count=0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i]>num){
                count++;
            }              
        }
        System.out.println("Number of values greater than "+num+" is: "+count); 
    }
    public static void squareArray(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            myArray[i]=(int) Math.pow(myArray[i], 2);      
        }
        System.out.println("Squared array is: "+ Arrays.toString(myArray)); 
    }
    public static void eliNegNum(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            if (myArray[i]<0){
                myArray[i]=0;
            } 
        }
        System.out.println("New array is: "+ Arrays.toString(myArray)); 
    }
    public static void maxMinAvgNum(int[] myArray){
        int max=myArray[0];
        int min=myArray[0];
        double avg=0;
        int sum=0;
        Object[] newArray= new Object[3];
        for(int i=0; i<myArray.length; i++){
            if(max < myArray[i]){
                max = myArray[i];
            }   
            else if(min > myArray[i]){
                min = myArray[i];
            }
            sum+=myArray[i];
        }
        avg=(double)sum/myArray.length;
        newArray[0]=max;
        newArray[1]=min;
        newArray[2]=avg;
        System.out.println("New array is: "+ Arrays.toString(newArray)); 
    }
    public static void shiftArray(int[] myArray){
        
        for(int i=0; i<myArray.length-1; i++){
            myArray[i]=myArray[i+1];
        }
        myArray[myArray.length-1]=0;
        System.out.println("New array is: "+ Arrays.toString(myArray)); 
    }
}