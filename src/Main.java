import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] expenses = generateRandomArray();
        int summa = 0;
        for (int i = 0; i < expenses.length; i++) {
            summa += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] expenses = generateRandomArray();
        int maxArr = -1;
        int minArr = 1;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxArr)  {
                maxArr = expenses[i];
                if (expenses[i] > minArr){
                    minArr = expenses[1];
                }
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей." +
                "Минимальная сумма трат за день составила " + minArr + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] expenses = generateRandomArray();
        double sum = 0;

        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i] / 30;

        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] );
        }
    }
}


