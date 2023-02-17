import java.util.HashMap;
import java.util.HashSet;

public class Statistics {

    public static HashSet<String> myHashSet = new HashSet<>();  //объявление переменной, иницаализация

    public static HashMap<String, Integer> myHashMap = new HashMap<>();

    public static int addEntry(String temp){
        myHashSet.add(temp);
        return 200;
    }

    public static HashSet<String> allPages(){
        for (String i : myHashSet)
            System.out.println(i);
        return myHashSet;
    }

        public static void main(String[] args) {

        addEntry("https://www.apex-football.com");
        addEntry("www.yandex.ru");
        addEntry("https://rbc.ru");

        allPages();



    }
}
