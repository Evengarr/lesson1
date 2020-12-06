package Lesson1;

public class tasksForLesson_1_5 {
    public static void main(String[] args) {
        int a = 5;
        int b = -10;
        checkingForPositivity(a);
        checkingForPositivity(b);
    }
    public static void checkingForPositivity(int x){
        if (x >= 0){
            System.out.println("Number " + x + " is positive");
        }
        else {
            System.out.println("Number " + x + " is negative");
        }
    }
}
