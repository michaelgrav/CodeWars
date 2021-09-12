import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        String deciphered = "";
        String length = reader.nextLine();
        String encoded = reader.nextLine();

        for (int i = 0; i < Integer.parseInt(length); i++) {
            if (!Character.isWhitespace(encoded.charAt(i))) {
                int asciiValue = encoded.charAt(i);
                if (asciiValue < 69) {
                    asciiValue -= 5;
                    deciphered += (char)(90 - (64 - asciiValue));
                }

                else {
                    asciiValue -= 5;
                    deciphered += (char)asciiValue;
                }
            }

            else {
                deciphered += " ";
            }
        }

        System.out.println(deciphered);
    }
}
