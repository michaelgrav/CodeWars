import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class prob20 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("prob20-1-in.txt"));
        Map<String, Integer> buildings = new TreeMap<>();
        int numOfBuildings = reader.nextInt();
        int counter = 0;
        reader.nextLine();
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            Scanner parse = new Scanner(line);

            System.out.println(line);

            int height = parse.nextInt();
            String name = parse.next();
            buildings.put(name, height);
        }

        int shortest = 100000;
        while (counter < numOfBuildings) {
            for (int i = 65; i < buildings.size()+65; i++) {
                if (buildings.get(String.valueOf((char)i)) < shortest) {


                   // shortest = buildings.get(String.valueOf((char)i);
                }
            }

            counter++;
        }

    }
}
