/**
 * Created by wwf12 on 2017-12-27.
 */
public class Star3 {
    public static void main(String[] args) {
        int i;
        int j=0;

        for(i=0; i<=3; i++) {
            for(j=3; j>=i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

            /*for(j=0; i<=4; j++) {
                System.out.print("*");
                System.out.println();
            }*/

        }
    }
}
