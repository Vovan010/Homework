public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException( int row, int col){
        super(String.format("Анализировать исключение int в массиве [ id, id]", row, col));
    }
}
