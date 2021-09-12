import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("input.txt"));
        ArrayList<String> list = new ArrayList<>();
        while(reader.hasNextLine())
        {
            String temp = reader.nextLine();
            if(temp.equals("END"))
            {
                break;
            }
            else
            {
                list.add(temp);
            }
        }
        ArrayList<String> tasty = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            Scanner asdf = new Scanner(temp);
            String id = temp.substring(temp.lastIndexOf('-')+1, temp.indexOf(' '));
            String time = temp.substring(temp.indexOf(' ')+1, temp.lastIndexOf(' '));
            String type = temp.substring(temp.lastIndexOf(' ')+1);
            int protection = Integer.parseInt(type)*10;
            int hours = protection/60;
            int min = protection%60;
            int h =Integer.parseInt( time.substring(0,2));
            int m =Integer.parseInt( time.substring(3));
            if(m+min>=60)
            {
                hours += (m+min)/60;
            }
            if(h+hours < 17)
            {
                tasty.add(id);
            }

        }
        if(tasty.isEmpty())
        {
            System.out.println("Blah, blah, blah, time to order delivery");
        }
        else
        {
            String qwer = tasty.get(0);
            for (int j = 1; j < tasty.size(); j++) {
                qwer += ", " + tasty.get(j);
            }
            System.out.println("Villagers (" + qwer + ") look tasty");
        }
    }
}
