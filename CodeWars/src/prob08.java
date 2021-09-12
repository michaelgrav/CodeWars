import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob08 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        int wallHeight = reader.nextInt();
        int punchHeight = reader.nextInt();
        int angryLevel = reader.nextInt();

        int knockBackLength = 0;

        if (punchHeight == 0 || punchHeight > wallHeight) {
            for (int i = 0; i < wallHeight; i++) {
                System.out.println("#");
            }
        }

        else {
            if (angryLevel > 10) {
                while (angryLevel > 10) {
                    knockBackLength += 1;
                    angryLevel -= 10;
                }
            }


            if (knockBackLength == 0) {
                for (int i = 0; i < wallHeight; i++) {
                    System.out.print("#");
                }
            }

            else if (knockBackLength > 0) {
                for (int i = (punchHeight - 1); i > 1; i--) {
                    System.out.println("#");
                }

                System.out.print("#");

                for (int i = 0; i < knockBackLength; i++) {
                    System.out.print(".");
                }

                for (int i = 0; i < (wallHeight - (punchHeight - 1)); i++) {
                    System.out.print("#");
                }
            }
        }
    }
}
