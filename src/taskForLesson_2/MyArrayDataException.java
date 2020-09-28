package taskForLesson_2;

public class MyArrayDataException extends Exception {
    private int x;
    private int y;

    MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void getMessageMyData(){
        System.out.println("Ошибка в ячейке: " + x + " x " + y);
    }

}