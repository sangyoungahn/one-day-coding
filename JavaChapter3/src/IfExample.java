/**
 * Created by wwf12 on 2017-12-27.
 */
public class IfExample {
    public static void main(String[] args) {
        int score = 70;

        if(90 <= score && score <= 100)
            System.out.println("A+");
        else if(80 <= score && score < 90)
            System.out.println("B+");
        else if(70 <= score && score < 80)
            System.out.println("C+");
        else
            System.out.println("D");
    }
}
