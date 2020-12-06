package Lesson1;


public class tasksForLesson_1_4 {
    public static void main(String[] args) {
        int a = 22;
        int b = 75;
        int c = 5;
        int d = 11;
        boolean summ1 = check(a, b);
        System.out.println(summ1);
        boolean summ2 = check(c, d);
        System.out.println(summ2);
    }
    public static boolean check(int x, int y){
        int z = x + y;
        if (z >= 10 && z <= 20) {
            return true;
        }
        return false;
    }
}
