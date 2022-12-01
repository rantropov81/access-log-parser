import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int x=1;
            int n=0;
            while (x==1) {
                System.out.println("ведите путь к файлу: ");
                String path = new Scanner(System.in).nextLine();
                File file = new File(path);
                boolean fileExists = file.exists();
                boolean isDirectory = file.isDirectory();
                if(!fileExists || isDirectory) {
                    System.out.println("Указанный файл не существует или указанный путь является путём к папке, а не к файлу");
                    continue;
                }
                if(fileExists) {
                    n++;
                    System.out.println("Путь указан верно");
                    System.out.println("Это файл номер "+n);
            }
        }
    }
    }

