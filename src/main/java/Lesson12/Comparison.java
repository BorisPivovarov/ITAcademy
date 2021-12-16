package Lesson12;

public class Comparison {

    private boolean x = false;

    public Comparison(Object[][] arr) {
    }

    public void ComparisonAndSum(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int b = 4;
        int sum = 0;

        if (a.length == b && a[0].length == b && a[1].length == b && a[2].length == b && a[3].length == b) {
            x = true;
        }
        if (!x) {
            throw new MyArraySizeException();
        }

        for (int j = 0; j < a.length; j++) {
            for (String[] strings : a) {
                try {
                    sum += (Integer.parseInt(strings[j]));
                } catch (MyArrayDataException e) {
                    System.out.println("Oops");
                }
            }
        }
        System.out.println(sum);
    }
}

