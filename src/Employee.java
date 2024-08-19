public class Employee {
    //Задание 1
    String fullName;
    String jobTitle;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee() {
        fullName = "Ширяев Владимир Александрович";
        jobTitle = "Тестировщик";
        email = "vovan47276@gmail.com";
        phoneNumber = "+375296700990";
        salary = 5000;
        age = 20;
    }

    public void someInfo() {
        System.out.println("ФИО: " + fullName + " \nДолжность: " + jobTitle + " \nEmail: " + email +
                " \nТелефон: " + phoneNumber + " \nЗарплата: " + salary + " \nВозраст: " + age);
    }
}


