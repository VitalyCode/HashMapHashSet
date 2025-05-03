import java.util.*;

public class Program {
    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>(); // Коллекция HashMap<>
        costPerAddress.put(new Address("Россия", "Майкоп"), 100); // Ключ Address - Значение - 100
        costPerAddress.put(new Address("Россия", "Ростов"), 150); // Ключ Address - Значение - 100
        costPerAddress.put(new Address("Россия", "Краснодар"), 200); // Ключ Address - Значение - 100
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Set<String> countries = new HashSet<>();
        while (true) {
            System.out.println("Заполнение нового заказа:.");
            System.out.print("Введите страну: ");
            String страна = scanner.nextLine(); // Страна
            if (страна.equals("end")) {
                System.out.println("Программа завершена!!!");
                break;
            }
            System.out.print("Введите город: ");
            String город = scanner.nextLine(); // Город
            System.out.print("Введите вес (кг)");
            int вес = Integer.parseInt(scanner.nextLine()); // Вес

            Address address = new Address(страна, город);
            if (costPerAddress.containsKey(address)) {
                int стоимостьДоставки = вес * costPerAddress.get(address);
                total += стоимостьДоставки;
                countries.add(страна);
                System.out.println("Стоимость доставки составит: " + стоимостьДоставки);
                System.out.println("Общая стоимость всех доставок: " + total);
                System.out.println("Количесвто посещенных стран: " + countries.size());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Значение №1");
        map.put(2, "Значение №2");
        map.put(3, "Значение №3");
        map.put(4, "Значение №4");
        if (map.containsKey(3)) {
            System.out.println("В HashMap - есть ключ с подобным номером");
        } else {
            System.out.println("Такого ключа нет");
        }
    }
}
