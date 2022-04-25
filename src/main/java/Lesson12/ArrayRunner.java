package Lesson12;

import java.util.Arrays;

public class ArrayRunner {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] trueArray = new String[][]{{"1", "0", "4", "10"}, {" ", "60", "7", "9"}, {"28", "29", "24", "25"}, {"5", "5", "5", "5"}};

        System.out.println(Arrays.deepToString(trueArray));
        try {
            new Comparison(trueArray).comparisonAndSum(trueArray);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: неправильный размер массива");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: в массиве имеется нечисленный элемент");
        }
    }
}
