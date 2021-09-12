import java.util.Scanner;
import java.io.*;
class test {
    public static void main(String[] args) throws FileNotFoundException{
            Scanner reader = new Scanner(new File("lab04d.dat"));
            reader.useDelimiter(",");
            double firstNumber = reader.nextDouble();
            double secondNumber = reader.nextDouble();
            double thirdNumber = reader.nextDouble();
            double fourthNumber =reader.nextDouble();
            double addOne = (firstNumber+secondNumber);
            double subtractOne = (firstNumber-secondNumber);
            double multiplyOne = (firstNumber*secondNumber);
            double divideOne = (firstNumber/secondNumber);
            double addTwo = (thirdNumber+fourthNumber);
            double subtractTwo = (thirdNumber-fourthNumber);
            double multiplyTwo = (thirdNumber*fourthNumber);
            double divideTwo = (thirdNumber/fourthNumber);
            System.out.println(""+firstNumber+" + "+secondNumber+" "+addOne+"");
            System.out.println(""+firstNumber+" - "+secondNumber+" "+subtractOne+"");
            System.out.println(""+firstNumber+" * "+secondNumber+""+multiplyOne+"");
            System.out.println(""+firstNumber+" / "+secondNumber+""+divideOne+"");
            System.out.println(""+thirdNumber+" + "+fourthNumber+""+addTwo+"");
            System.out.println(""+thirdNumber+" - "+fourthNumber+""+subtractTwo+"");
            System.out.println(""+thirdNumber+" * "+fourthNumber+""+multiplyTwo+"");
            System.out.println(""+thirdNumber+" / "+fourthNumber+""+divideTwo+"");
    }
}

