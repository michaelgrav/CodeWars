import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        double height = reader.nextDouble();
        double radius = reader.nextDouble();
        System.out.println((double)Math.round((Math.PI * radius * height * radius)*100)/100 + " cubic inches");
    }
}
