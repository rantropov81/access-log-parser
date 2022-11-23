import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        int number = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();
        int mult = number * number2;
        int sum = number + number2;
        int dif = number - number2;
        double div = (double) number / number2;

    }
}