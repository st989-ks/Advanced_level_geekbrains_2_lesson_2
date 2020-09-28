package taskForLesson_2;

public class Main {

    public static void main(String[] args) {
        String[][] w = {
                {"1", "2", "3", "4",},
                {"5", "6", "7", "8",},
                {"9", "10", "11", ",kl",},
                {"13", "14", "15", "16",},
        };

        try {
            checkArr( w );
        } catch (MyArraySizeException e) {
            e.getMessageMySize();

        } catch (MyArrayDataException e) {
            e.getMessageMyData();
        }
        System.out.println("END");

    }


    public static void checkArr(String[][] newArr)
            throws MyArraySizeException, MyArrayDataException{

        int sum = 0;
        int sizeArr = 4;

        if (newArr.length != sizeArr) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < newArr.length; i++) {

            if (newArr[i].length != sizeArr) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < newArr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt( newArr[i][j] );
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException( i, j );
                }
            }
        }
    }
}
