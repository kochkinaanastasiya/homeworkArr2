public class Main {

    public static void main(String[] args) {
        // Задача 1
        int[] myArr = generateRandomArray();

        int sum = 0;
        for (int spending : myArr) {
            sum += spending;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2

        int min = myArr[0];
        int max = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (min > myArr[i]) {
                min = myArr[i];
            } else if (max < myArr[i]) {
                max = myArr[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + min +
                    " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // Задача 3
        double mean = sum / myArr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей.");

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

        /*int min = myArr[29];
        for (int i = 30; i < myArr.length; i--) {
            if (myArr[i] < min) min = myArr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");

        int max = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] > max) max = myArr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");*/

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}