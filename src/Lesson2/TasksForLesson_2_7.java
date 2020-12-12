package Lesson2;

/**
 * Написать метод, которому на вход подается одномерный массив и число n
 * (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
 * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ]
 * при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 */
public class TasksForLesson_2_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = 3;
        offset(arr, a);
    }

    private static void offset(int[] arr, int a) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        if (a > 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (i + a >= arr.length) {
                    arr1[i + a - arr.length] = arr[i];
                } else
                    arr1[i + a] = arr[i];
            }
            for (int i : arr1) System.out.print(i + " ");
        }
        if (a <= 0) {
            int b = a * (-1);
            int z = 0;
            for (int x = 0; x < arr.length; x++) {
                if (x + b < arr.length) {
                    arr2[x] = arr[x + b];
                } else {
                    arr2[x] = arr[z];
                    z++;
                }
            }
            for (int x : arr2) System.out.print(x + " ");
        }
    }
}
 /* for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i < arr.length - 2){
                arr[i] = arr[a + i];
            }
            else if (i == arr.length - 1){
                arr[i] = 0;
            }
            else if(i == arr.length - 2){
                arr[i] = 0;
            }


            System.out.print(arr[i] + " ");
        }*/




