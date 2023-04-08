import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{
    
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
 } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иван Иванов", 123, bookPhone);
        addNumber("Светлана Петрова", 1234, bookPhone);
        addNumber("Кристина Белова", 546585, bookPhone);
        addNumber("Анна Мусина", 8956477, bookPhone);
        addNumber("Анна Крутова", 12356233, bookPhone);
        addNumber("Петр Лыков", 76546, bookPhone);
        addNumber("Павел Чернов", 523789, bookPhone);
        addNumber("Петр Чернышов", 57462, bookPhone);
        addNumber("Мария Федорова", 85738, bookPhone);
        addNumber("Марина Светлова", 787897, bookPhone);
        addNumber("Мария Савина", 876546, bookPhone);
        printBook(bookPhone);
       }
}
