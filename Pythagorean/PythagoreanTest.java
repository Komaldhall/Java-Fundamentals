public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean hypoTenuse = new Pythagorean();
        int a = 3;
        int b = 4;
        double hypo=hypoTenuse.calculateHypotenuse(a,b);
        System.out.println(hypo);
    }
}