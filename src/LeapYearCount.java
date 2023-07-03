public class LeapYearCount {
    public static int leapYearCount(int year) {
        int result = 0;
        for (int n = 1; n <= year; n++){
            if (n % 4 == 0 && n % 100 != 0) result++;
            if (n % 400 == 0) result++;
        }

        return result;
    }
}
