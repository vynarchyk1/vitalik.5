public class MaxNumberFinder {
    public static void main(String[] args) {
        int[] array = {7, 10, 3, 2, 8};
        int max = findMax(array);
        System.out.println("Найбільше число в масиві: " + max);
    }

    // Метод для знаходження найбільшого числа в масиві
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
