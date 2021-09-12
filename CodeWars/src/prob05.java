import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("prob05-2-in.txt"));
        int num = reader.nextInt();
        ArrayList<String> dup = new ArrayList<>();
        reader.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String temp = reader.nextLine();
            temp = temp.substring(0,5);
            if (list.contains(temp))
            {
                if(!dup.contains(temp))
                {
                    dup.add(temp);

                }
            }
            list.add(temp);
        }
        if(!dup.isEmpty())
        {
            System.out.println(dup.size());
            String duplicates = "";
            duplicates += dup.get(0);
            for (int i = 1; i < dup.size(); i++) {
                duplicates += " " + dup.get(i);
            }
            System.out.println("duplicates: "+ duplicates);
        }
        else
        {
            System.out.println("0");
            System.out.println("duplicates: None");
        }

    }
}
