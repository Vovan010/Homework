

public class Methods {
    //Задание 1
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 2
    public void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 3
    public void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
            return;
        }
        if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    //Задание 4
    public void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Задание 5
    public boolean sumOfNumbers(int a, int b) {
        int c = a + b;
        if (c > 9 && c < 21) {
            System.out.println("Лежит в пределах от 10 до 20");
            return true;
        } else {
            System.out.println("Не лежит в пределах от 10 до 20");
            return false;
        }
    }

    //Задание 6
    public void isNumberPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Задание 7
    public boolean isNumberPositive(int number) {
        if (number < 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    //Задание 8
    public void printString(String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }

    //Задание 9
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    //Задание 10
    public int[] arrIsInteger(int[] arr) {
        int[] array = new int[9];
        for (int i = 0; i < 9; i++) {
            if (arr[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }

    //Задание 11
    public int[] arrIsEmptyInteger() {
        int[] newArr = new int[100];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = i + 1;
        }
        return newArr;
    }

    //С заданиями 12 - 14 возникли проблемы, поэтому хотел бы попросить совета для выполнения
}
