public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz name = new FizzBuzz();
        
        String Fizzy=name.fizzBuzz(3);
        System.out.println("Number:3 "+Fizzy);
        Fizzy=name.fizzBuzz(5);
        System.out.println("Number:5 "+Fizzy);
        Fizzy=name.fizzBuzz(15);
        System.out.println("Number:15 "+Fizzy);
        Fizzy=name.fizzBuzz(29);
        System.out.println("Number:20 "+Fizzy);
    }
}