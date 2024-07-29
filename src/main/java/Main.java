public class Main {
    public static void main(String[] args) {
        //задание 1
        int[] weights = new int[]{1, 2, 3};
        double[] numbers = new double[3];
        int[] height = new int[5];
        //задание 2
        numbers[0] = 1.57;
        numbers[1] = 7.654;
        numbers[2] = 9.986;
        height[0] = 2;
        height[1] = 4;
        height[2] = 6;
        height[3] = 8;
        height[4] = 10;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < weights.length; i++) {
            if (i != weights.length - 1) {
                s.append(weights[i]).append(", ");
            } else {
                s.append(weights[i]);
            }
        }
        System.out.println(s);

        s = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                s.append(numbers[i]).append(", ");
            } else {
                s.append(numbers[i]);
            }
        }
        System.out.println(s);

        s = new StringBuilder();
        for (int i = 0; i < height.length; i++) {
            if (i != height.length - 1) {
                s.append(height[i]).append(", ");
            } else {
                s.append(height[i]);
            }
        }
        System.out.println(s);
        //задание 3
        s = new StringBuilder();
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i != 0) {
                s.append(weights[i]).append(", ");
            } else {
                s.append(weights[i]);
            }
        }
        System.out.println(s);

        s = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                s.append(numbers[i]).append(", ");
            } else {
                s.append(numbers[i]);
            }
        }
        System.out.println(s);

        s = new StringBuilder();
        for (int i = height.length - 1; i >= 0; i--) {
            if (i != 0) {
                s.append(height[i]).append(", ");
            } else {
                s.append(height[i]);
            }
        }
        System.out.println(s);
        //задание 4
        s = new StringBuilder();
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] = weights[i] + 1;
            }
            if (i != weights.length - 1) {
                s.append(weights[i]).append(", ");
            } else {
                s.append(weights[i]);
            }
        }
        System.out.println(s);

    }
}