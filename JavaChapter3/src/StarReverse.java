/**
 * Created by wwf12 on 2017-12-27.
 */
public class StarReverse {
    public static void main(String[] args) {
        int i;
        int j=0;

        for(i=0; i<=4; i++) {
            for(j=4; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
