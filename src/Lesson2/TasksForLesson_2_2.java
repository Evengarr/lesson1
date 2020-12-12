package Lesson2;

/**
 * Задать пустой целочисленный массив размером 8.
 * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
 */
public class TasksForLesson_2_2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        completion(arr);
    }

    static void completion(int[] arr) {
        for (int i = 0; i <= 21; i = i + 3) {
            arr[i / 3] = i;
        }
        for (int x = 0; x < 8; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
