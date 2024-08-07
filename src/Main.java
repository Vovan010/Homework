import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Methods methods = new Methods();
        methods.printThreeWords();
        methods.checkSumSign(2, 20);
        methods.printColor(103);
        methods.compareNumbers(9,8);
        methods.sumOfNumbers(11,6);
        methods.isNumberPositiveOrNegative(50);
        methods.isNumberPositive(25);
        methods.printString("Hello", 5);
        methods.isLeapYear(2024);
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array = methods.arrIsInteger(arr);
        System.out.println(Arrays.toString(array));
        methods.arrIsEmptyInteger();
    }
}