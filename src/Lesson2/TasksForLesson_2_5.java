package Lesson2;

/**
 * Задать одномерный массив и найти в нем минимальный и максимальный элементы
 */
public class TasksForLesson_2_5 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 7, 10, 55, -6, 0, -20, 100};
        findingTheMinimumNumber(arr);
    }

    static void findingTheMinimumNumber(int[] arr) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                x = arr[i];
                y = arr[i + 1];
            } else {
                x = arr[i + 1];
                y = arr[i];
            }
        }
        System.out.println("minimum number: " + x);
        System.out.println("maximum number: " + y);
    }

   /* static void findingTheMaximumNumber(int [] arr){
        int x = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
                x = arr[i];
            }
           else x = arr[i+1];
        }
        System.out.println("maximum number: " + x);
    }*/
}
