package DiamondPackage;

/**
 * Created by lenovo on 23/8/16.
 */
public class DiamondExcercise {

    private DiamondExcercise(){}

    public static int printIsoscelesTriangle(int n){
        int scount=n,acount=1,return_acount=0;
        for(int i=0;i<n;i++) {
            for (int spaceCount = 0; spaceCount <= scount; spaceCount++) {
                System.out.print(" ");
            }
            scount--;
            for(int asteriskCount=0;asteriskCount<acount;asteriskCount++){
                System.out.print("*");
            }
            if(n-2==i)
                return_acount=acount;
            acount+=2;
            System.out.println();
        }
        return return_acount;
    }

    public static void printDiamond(int n){
        int scount=3,acount;
        acount=printIsoscelesTriangle(n)-1;
       // System.out.println("Done");
        for(int i=0;i<n;i++) {
            for (int spaceCount = 0; spaceCount < scount; spaceCount++) {
                System.out.print(" ");
            }
            scount++;
            for(int asteriskCount=0;asteriskCount<=acount;asteriskCount++){
                System.out.print("*");
            }
            acount-=2;
            System.out.println();
        }
    }

    /*public static void printDiamondWithName(int n){
        int scount=0,acount=n;
        printIsoscelesTriangle(n);
        System.out.println("APURVA");
        for(int i=0;i<n;i++) {
            for (int spaceCount = 0; spaceCount < scount; spaceCount++) {
                System.out.print(" ");
            }
            scount++;
            for(int asteriskCount=0;asteriskCount<acount;asteriskCount++){
                System.out.print("*");
            }
            acount-=2;
            System.out.println();
        }
    }*/

    public static void printDiamondWithName(int n){
        int scount=n,acount=1,return_acount=0,return_scount=0;
        for(int i=0;i<n-1;i++) {
            for (int spaceCount = 0; spaceCount <= scount; spaceCount++) {
                System.out.print(" ");
            }
            scount--;
            for(int asteriskCount=0;asteriskCount<acount;asteriskCount++){
                System.out.print("*");
            }
            System.out.println();
            if(n-2==i) {
                System.out.println("Apurva");
                return_acount = acount;
                return_scount = scount;
            }
            acount+=2;
        }
        //System.out.println("Scount is : "+scount);

        scount=return_scount+1;
        acount=return_acount;
        for(int i=0;i<n-1;i++) {
            for (int spaceCount = 0; spaceCount <= scount; spaceCount++) {
                System.out.print(" ");
            }
            scount++;
            for(int asteriskCount=0;asteriskCount<acount;asteriskCount++){
                System.out.print("*");
            }
            acount-=2;
            System.out.println();
        }
    }
}
