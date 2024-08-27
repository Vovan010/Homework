public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException( int a, int b){
        super(String.format("Анализировать исключение int в массиве [ , ]", a, b));
    }
}
