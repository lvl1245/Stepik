public class BoleanExpression {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        Boolean[] BoolArr = {a,b,c,d};
        int TrueNum = 0;
        for (boolean now : BoolArr){
            if (now) TrueNum++;
        }

        return TrueNum == 2 ? true : false;
    }
}
