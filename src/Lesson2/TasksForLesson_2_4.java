package Lesson2;

/**
 * Создать квадратный двумерный целочисленный массив
 * (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
 * заполнить его диагональные элементы единицами;
 */
public class TasksForLesson_2_4 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        creatingASquare(arr);
    }

    static void creatingASquare(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i || j + i == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " " + " ");
            }
            System.out.println();
        }
    }
}
