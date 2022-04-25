package Lesson12;

public class Comparison {

    private boolean x = false;

    public Comparison(Object[][] arr) {
    }

    public void comparisonAndSum(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int b = 4;
        int sum = 0;
        int parseArg = 0;

        if (a.length == b && a[0].length == b && a[1].length == b && a[2].length == b && a[3].length == b) {
            x = true;
        }
        if (!x) {
            throw new MyArraySizeException();
        }

        for (String[] strings : a) {
            for (int j = 0; j < a.length; j++) {
                    try {
                        sum += (Integer.parseInt(strings[j]));
                    } catch (MyArrayDataException e) {
                        e.toString("Ошибочка");
                    }
                }
            }
        System.out.println(sum);
    }
}

