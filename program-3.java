public class ConditionalOddSeries {
    public static void main(String[] args) {

        int a = 6; // input

        int terms = (a % 2 == 0) ? (a - 1) : a;

        for (int i = 1; i <= terms; i++) {
            System.out.print((2 * i - 1) + " ");
        }
    }
}
