public class Main {
    public static void main(String[] args) {

        double array[] = {1, 2.2, 3.3, -1, 4, -1.7, -5, 8.4, 2, 6, -12.8, 2, 12.5, -54.1, 14.3};

        double sum = 0;

        int cnt = 0;

        boolean check = false;

        for (double currentElem : array) {
            if (currentElem < 0) {
                check = true;
            } else if (check) {
                sum = sum + currentElem;
                cnt++;
            }
        }
        System.out.println(sum + " / " + cnt + " = " + sum / cnt);
    }
}