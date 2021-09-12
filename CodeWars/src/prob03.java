import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob03 {
    public static void main(String[] args) throws FileNotFoundException {
        int count =0;
        Scanner reader = new Scanner(new File("input.txt"));
        ArrayList<String> map = new ArrayList<>();
        while(reader.hasNextLine())
        {
            map.add(reader.nextLine());
        }
        for (int i = 0; i < map.size(); i++) {
            String temp = map.get(i);
            if(temp.contains("P"))
            {
                int index = temp.indexOf("P");
                System.out.println("Ace, move fast, pigeon is at (" + index + ", " + i+ ")");
                count= 1;
            }
        }
        if(count ==0)
        {
            System.out.println("No pigeon, try another map, Ace");
        }



    }
}
