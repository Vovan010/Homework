
public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arr2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "Error", "16"}
        };

        System.out.println(sumArray.sumArray(arr));

        try {
            System.out.println(sumArray.sumArray(arr1));
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(sumArray.sumArray(arr2));
        } catch (MyArrayDataException e){
            System.err.println(e.getMessage());
        }
    }
}
