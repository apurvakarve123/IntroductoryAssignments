package PrimeListPackage;
import java.util.ArrayList;
/**
 * Created by lenovo on 24/8/16.
 */
public class PrimeListExcercise {

    private PrimeListExcercise(){}

    public static ArrayList<Integer> generate(int n)
    {
        ArrayList<Integer> primeFactors=new ArrayList<Integer>();
        int squareRootOfN=(int)Math.sqrt(n);
        for(int i=2;i<=squareRootOfN;i++){
            if(n%i==0){
                if(isPrime(n)){
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

    public static boolean isPrime(int n){
        int squareRootOfN=(int)Math.sqrt(n);
        for(int i=2;i<=squareRootOfN;i++){
            if(n%i==0)
                return true;
        }
        return false;
    }
}
