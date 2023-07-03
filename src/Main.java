import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      // System.out.println( booleanExpression(true, true, true,false) );
       // System.out.println( leapYearCount(100) );
        System.out.println(isPowerOfTwo(17));

    }
    public static boolean isPowerOfTwo(int value) {
        return  java.lang.Integer.bitCount(Math.abs(value)) == 1;
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        Boolean[] BoolArr = {a,b,c,d};
        int TrueNum = 0;
        for (boolean now : BoolArr){
            if (now) TrueNum++;
        }

        return TrueNum == 2 ? true : false;
    }
}