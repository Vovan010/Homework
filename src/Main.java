//Задание 2
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Иванов", "789-012");
        phoneBook.add("Петров", "345-678");
        phoneBook.add("Сидоров", "456-789");
        phoneBook.add("Петров", "987-654");

        // Получаем номера телефонов по фамилии
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));

        // Выводим весь справочник
        System.out.println("\nВесь телефонный справочник:");
        phoneBook.printAll();
    }
}
