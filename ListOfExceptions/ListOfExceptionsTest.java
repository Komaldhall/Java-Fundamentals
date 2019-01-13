public class ListOfExceptionsTest {
    public static void main(String[] args) {
        ListOfExceptions exceptions = new ListOfExceptions();
        try{
            exceptions.exceptionList();
            System.out.println("There is no Exceptions!");
        } 
        catch (ClassCastException e){
            System.out.println("Hey, we ran into trouble now!!");
        }
        
    }   

}