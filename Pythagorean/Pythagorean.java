public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        int hyp= (legA*legA)+(legB*legB);
        double squareRoot= Math.sqrt(hyp);
        return squareRoot;
        
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
    }
}