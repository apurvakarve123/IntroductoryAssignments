package PrimeListPackage;
import java.util.ArrayList;
/**
 * Created by lenovo on 24/8/16.
 */
public class PrimeListTest {
    public static void main(String[] args){
        System.out.println("Lets find out the prime factors of 30");
        ArrayList<Integer> factors=PrimeListExcercise.generate(30);
        System.out.println(factors);

        System.out.println("Lets find out the prime factors of 1");
        factors=PrimeListExcercise.generate(1);
        System.out.println(factors);

        System.out.println("Lets find out the prime factors of 100");
        factors=PrimeListExcercise.generate(100);
        System.out.println(factors);
    }
}
