package taskForLesson_2;

public class MyArraySizeException extends Exception {

    MyArraySizeException() {

    }

    public void getMessageMySize() {
        System.out.println("Массив не 4х4");
    }
}