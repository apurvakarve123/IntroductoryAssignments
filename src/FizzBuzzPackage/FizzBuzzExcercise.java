package FizzBuzzPackage;

/**
 * Created by lenovo on 23/8/16.
 */
public class FizzBuzzExcercise {

    private FizzBuzzExcercise(){}

    public static void FizzBuzz(){
        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
}
