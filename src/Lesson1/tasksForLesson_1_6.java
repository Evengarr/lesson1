package Lesson1;

public class tasksForLesson_1_6 {
    public static void main(String[] args) {
        int a = 5;
        int b = -7;
        boolean check1 = checkingForPositivity(a);
        System.out.println(check1);
        boolean check2 = checkingForPositivity(b);
        System.out.println(check2);
    }
    public static boolean checkingForPositivity(int x){
        if (x < 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
