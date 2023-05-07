import java.util.Scanner;
import org.json.simple.JSONObject;



public class task1 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        JSONObject database = new JSONObject();
        database.put("фамилия", "Хазанов");
        database.put("имя", "Николай");
        database.put("отчество", "Викторович");
        database.put("страна","Израиль");
        database.put("город","Иерусалим");
        database.put("возраст","26");
        System.out.println("Введите ключевое слово для поиска:\n");
        var search = System.console().readLine();
        if(database.containsValue(search)){
            System.out.println("Фамилия: " + database.get("фамилия"));
            System.out.println("Имя: " + database.get("имя"));
            System.out.println("Отчество: " + database.get("отчество"));
            System.out.println("Страна: " + database.get("страна"));
            System.out.println("Город: " + database.get("город"));
            System.out.println("Возраст: " + database.get("возраст"));    
        }
        else System.out.println("Result not found.");
        iScanner.close();
    }
}