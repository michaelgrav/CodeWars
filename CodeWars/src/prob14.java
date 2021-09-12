import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob14 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        int numOfSticks = reader.nextInt();
        String size = reader.next();
        double sizeConverted = 0;
        int tensileLimit = reader.nextInt();

        if (size.contains("/")) {
            Scanner sizeReader = new Scanner(size);
            sizeReader.useDelimiter("/");
            double num = sizeReader.nextInt();
            double den = sizeReader.nextInt();
            sizeConverted = num / den;
        }
        else {
            sizeConverted = Integer.parseInt(size);
        }

        double kg = numOfSticks * sizeConverted * 0.45;
        double force = kg * 7.5;
        force = (double)Math.round(force * 100)/100;

        if (force <= tensileLimit) {
            System.out.println(force + " the Mask can eat it!");
        }

        else {
            System.out.println(force + " the Mask should not eat it!");
        }

    }
}
