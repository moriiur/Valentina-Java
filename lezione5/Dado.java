import java.util.Random;

public class Dado {
    public static int dado() {
        Random generator = new Random();

        return generator.nextInt(6);
        }

    public static void main(String[] args) {
        System.out.println(dado());
}
}