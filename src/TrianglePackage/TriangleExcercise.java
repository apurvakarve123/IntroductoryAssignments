package TrianglePackage;

/**
 * Created by lenovo on 23/8/16.
 */
public class TriangleExcercise {

    public static void printAsterisk(){
        System.out.println("*");
    }

    public static void printHorizontalLine(int n){
        for(int i=0;i<n;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }

    public static void drawRightAngledTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
