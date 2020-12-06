package com.company;

public class tasksForLesson_1_3 {

    public static void main(String[]args){
        float x = 12.7f;
        float y = 22.16f;
        float z = 1.65f;
        float w = 17.77f;
        float result = calculation(x, y, z, w);
        System.out.println(result);
    }

   static float calculation(float a, float b, float c, float d) {
        float r = a * (b + (c / d));
        return r;
    }
}
