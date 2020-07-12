package zone24x7;

public class MaxCalculator {

    public int calculate(int[] ints) {

        if (ints.length == 0||ints==null) {
                    throw  new IllegalArgumentException("The Array is Empty or Null");
        }

            int max = Integer.MIN_VALUE;

            for (int num : ints) {

                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
}
