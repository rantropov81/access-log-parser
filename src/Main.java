import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Сложение: " + (num1+num2));
        System.out.println("Вычитание: " + (num1-num2));
        System.out.println("Произведение: " + num1*num2);
        System.out.println("Частное: " + (double)num1/num2);
    }
    }

