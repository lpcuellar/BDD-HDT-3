import Java.util.Scanner;
import Java.util.Random;


public class Main {

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    CreateFiles newText = new CreateFiles();

    public static void main (Sring[] args) {

        System.out.println("Ingrese la cantidad de datos al que le desea hacer sort. ");
        int cNum = input.nextInt();
        if (cNum < 10 && cNum >3000) {


            for (int i = 0; i <= cNum; i++) {
                int number = random.randomNum;
                newText.WriteFile(number);
            }

        }

        else {
            System.out.println("Ingrese un numero entre 10 y 3000");
        }
    }
