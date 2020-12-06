package Lesson1;

public class tasksForLesson_1_8 {
    public static void main(String[] args) {
        int year = 2020;
        theDefinitionOfTheYear(year);
    }
    public static void theDefinitionOfTheYear(int x) {
        if(x % 4 == 0 && x % 100 !=0 || x % 400 == 0){
            System.out.println(x + " leap year");
        }
        else {
            System.out.println(x + " not a leap year");
        }
    }
}
