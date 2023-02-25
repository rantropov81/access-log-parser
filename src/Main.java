import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path;
        Statistics statistics = new Statistics();
        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу:");
            path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean pathOfFile = file.exists();
            boolean isNotDirectory = !file.isDirectory();
            if (pathOfFile && isNotDirectory) {
                System.out.println("Путь к файлу правильный");
                System.out.println("Это файл №" + ++count);
                try {
                    FileReader fileReader = new FileReader(path);
                    BufferedReader reader =
                            new BufferedReader(fileReader);

                    System.out.println("Total traffic: " + statistics.totalTraffic + " bytes");
                    System.out.println("Min time: " + statistics.minTime);
                    System.out.println("Max time: " + statistics.maxTime);
                    System.out.println("Traffic rate: " + statistics.getTrafficRate() + " bytes per hour");
                } catch (IOException e) {
                    System.out.println(e.fillInStackTrace());
                }


            } else {
                System.out.println("Файл отсутствует или путь ведет к директории файла");
            }
        }
    }
}