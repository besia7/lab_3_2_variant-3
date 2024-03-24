public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] array = new int[200];
        // Заповнюємо масив випадковими числами від -150 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 + 150 + 1)) - 150;
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                currentSum += array[i];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            } else {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Максимальна сума елементів у неперервній послідовності: " + maxSum);
        System.out.println("Початок послідовності: " + start);
        System.out.println("Кінець послідовності: " + end);
    }
}
