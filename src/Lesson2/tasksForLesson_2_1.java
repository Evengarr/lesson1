package Lesson2;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class tasksForLesson_2_1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        replacement(arr);
    }

    public static void replacement(int[] arr) {
        int i;
        int[] arrReplace = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arrReplace[i] = 0;
            } else arrReplace[i] = 1;
        }
        for (i = 0; i < arrReplace.length; i++) {
            System.out.print(arrReplace[i] + " ");
        }
    }
}
