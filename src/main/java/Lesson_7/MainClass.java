package Lesson_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {

     public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,7,8,9,0,1,2,3,5,6,7};
        int[] arr2 = new Test1Main().after4(arr);
        System.out.println("From main "+Arrays.toString(arr2));
    }

}
