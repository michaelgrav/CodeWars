import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob04 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner reader = new Scanner(new File("input.txt"));
        ArrayList<String> waves = new ArrayList<>();
        reader.nextLine();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            waves.add(line);
        }

        for (int i = waves.size() - 1; i >= 0; i--) {
            System.out.println(waves.get(i));
        }
    }
}
