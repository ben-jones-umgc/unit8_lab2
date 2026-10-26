public class NumberProgram {

    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 4};

        int result = findResult(values);

        System.out.println("Result: " + result);
    }

    /**
     * Returns the largest value in the array.
     * Returns Integer.MIN_VALUE if the array is null or empty.
     */
    public static int findResult(int[] values) {
        if (values == null || values.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}