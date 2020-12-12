package Lesson2;

/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 * пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public class TasksForLesson_2_3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(" было: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("стало: ");
        verificationAndMultiplication(arr);
    }

    static void verificationAndMultiplication(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
