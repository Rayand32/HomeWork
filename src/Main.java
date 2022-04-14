import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int degreeCelsius;
        int fahrenheitValue1 = 32;
        double fahrenheitValue2 = 1.8;
        double degreeCalvin = -273.15;
        int result;
        double resultSet;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет пересчитать температуру в Фаренгейты");

        System.out.print("Введите значение температуры по Цельсию:");
        degreeCelsius  = scanner.nextInt();

        result = (int) (fahrenheitValue1 + degreeCelsius * fahrenheitValue2);
        resultSet = degreeCalvin + degreeCelsius;

        System.out.println(" Температура по Фарингейту: " + result + " градусов." );

        System.out.println(" Температура по Кельвину: " + resultSet + " градусов." );

    }
}
