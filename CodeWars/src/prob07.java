import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prob07 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("prob07-2-in.txt"));
        double[][] array = new double[5][3];
        array[0][0] = .90;
        array[0][1] = .62;
        array[0][2] = .57;
        array[1][0] = .80;
        array[1][1] = .42;
        array[1][2] = .30;
        array[2][0] = .70;
        array[2][1] = .30;
        array[2][2] = .74;
        array[3][0] = 1.15;
        array[3][1] = .80;
        array[3][2] = .70;
        array[4][0] = .15;
        array[4][1] = .05;
        array[4][2] = .03;
        ArrayList<String> mat = new ArrayList<>();
        while(reader.hasNext())
        {
            mat.add(reader.next());
        }
        int y=0;
        int x=0;
        String temp = mat.get(0);
        switch (temp){
            case "WOOD":x=1;
                break;

            case"RUBBER":x=0;
                break;

            case"STEEL":x=2;
                break;

            case"CONCRETE":x=0;
                break;

            case"ICE":x=4;
                break;

        }
        temp = mat.get(1);
        switch (temp){
            case "WOOD":y=1;
                break;

            case"RUBBER":y=3;
                break;

            case"STEEL":y=2;
                break;

            case"CONCRETE":y=0;
                break;

            case"ICE":y=4;
                break;
        }
        double degree = (Math.toDegrees(Math.atan(array[y][x])));
        DecimalFormat df = new DecimalFormat("##.0");
        System.out.println(array[y][x] + " " + df.format(degree));
    }
}
