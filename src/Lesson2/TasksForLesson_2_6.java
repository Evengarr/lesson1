package Lesson2;

/**
 * Написать метод, в который передается не пустой одномерный целочисленный массив,
 * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 * Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
 * граница показана символами ||, эти символы в массив не входят.
 */
public class TasksForLesson_2_6 {
    public static void main(String[] args) {
        //int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        //int[] arr = {1, 1, 1, 2, 1};
        int[] arr = {1, 4, 5};
        System.out.println(checkingTheAmountOfParts(arr));
    }

    public static boolean checkingTheAmountOfParts(int[] arr) {
        int sum1, sum2;
        for (int a = 0; a < arr.length; a++) {
            sum1 = 0;
            sum2 = 0;
            for (int b = 0; b < a; b++)
                sum1 += arr[b];
            for (int b = a; b < arr.length ; b++)
                sum2 += arr[b];
            if (sum1 == sum2) return true;
        }
        return false;
    }
}
/**
 * попытка*/
        /*for (int a = 0; a < arr.length; a++){
            sum1 += arr[a];
            sum2 = 0;
            for (int b = arr.length - 1; b >= 0; b--) {
                //int summ;
                sum2 += arr[b];
                if (sum1 == sum2 && a == b) break;
                //summ = sum2;
            }
            if (sum1 == sum2) break;
        }*/
        //return sum1 == sum2;

        /*int sum1 = 0;
        int sum2 = 0;
        int a = 0;
        int b = 0;

        while (a < arr.length) {
            sum1 += arr[a];
            while (b < arr.length){
                if (sum2 == sum1 || a == (arr.length - b - 1)) break;
                sum2 += arr[arr.length - b - 1];
                b++;
            }
           if (sum2 == sum1 || a == (arr.length - b - 1)) break;
            a++;
        }

        return sum1 == sum2;
    }
}*/


/**
 * попытка*/



        /*int summ1 = 0;
        int summ2 = 0;
        int i;
        for (i = 0; i < arr.length-1; i++)
        int summ1 = checkingLeftPart(arr);
        int summ2 = checkingRightPart(arr);
        }
        return summ1 == summ2;
    }

    private static int checkingLeftPart(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    private static int checkingRightPart(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += arr.length-1;
        }
        return sum;*/



