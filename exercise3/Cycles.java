package ThirdExercise;

/**
 * Created by Admin on 24.10.2016.
 */
public class Cycles {

    public static void main(String[] args) {

        /*
        * Task a
        * */
        int size = 5;
        for (int row = 1; row <= size; ++row) {
            for (int col = 1; col <= size; ++col) {
                System.out.print("#");
            }
            System.out.println("#");
        }

        /*
        * Task b(a)
        * */
        String s = new String();
        for (int row = 0; row < 8; row++) {
            for (int col = 1; col < 2; col++) {
                s += "#";
                System.out.println(s);
            }
        }

        /*
        * Task b(b)
        * */
        String s1 = new String();
        int n = 8;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < n; col++) {
                s1 = "#";
                System.out.print(s1 + " ");
            }
            System.out.println();
            n = n - 1;
        }

        /*
        * Task b(c)
        * */

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

            }
            System.out.println();
        }

    }
}
