import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleNumbers {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[0];
        try {

            System.out.println("Ile liczb zmiennoprzecinkowych chcesz wprowadzić?");
            int number = scanner.nextInt();
            numbers = new double[number];
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Podaj liczbę zmiennoprzecinkową:");
                numbers[i] = scanner.nextDouble();
            }
        } catch (InputMismatchException ex) {
            System.err.println("Podałeś zły typ danych");
        }
        scanner.close();

        String fileName = "numFile.txt";
        try (
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {
            for (double tab : numbers) {
                writer.write(String.valueOf(tab));
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
