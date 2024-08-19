public class Employees {
    //Задание 2
    public void EmployeesArray() {
        Employees[] employeesArray = new Employees[5];
        employeesArray[0] = new Employees("Владимир Ширяев", "Тестировщик", "vovan47276@gmail.com",
                "375296700990", 5000, 20);
        employeesArray[1] = new Employees("Иванов Иван", "Разработчик", "ivanvan@gmail.com",
                "375291234567", 6000, 21);
        employeesArray[2] = new Employees("Игорь Смирнов", "Дизайнер", "smirnov25@gmail.com",
                "375297654321", 5500, 22);
        employeesArray[3] = new Employees("Артем Кузнецов", "Мененджер", "kyznec123@gmail.com",
                "375442143651", 3500, 23);
        employeesArray[4] = new Employees("Алексей Попов", "Сисадмин", "popov552gmail.com",
                "375449876543", 4000, 24);
    }

    public Employees(String fullName, String jobTitle, String email, String phoneNumber, int salary, int age) {
    }
}