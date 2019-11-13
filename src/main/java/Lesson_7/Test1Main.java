package Lesson_7;

public class Test1Main {

    public int[] after4(int[] arr){
        boolean f=false;
        int[] arr4=null;
        for (int i = arr.length-1; i >= 0; i--) {
            if ((arr[i]) == 4){
                arr4 = new int[arr.length-1-i];
                for (int j = 0; j < arr4.length; j++) {
                    arr4[j]=arr[i+1+j];
                }
                f=true;
                break;
            }
        }
        if (!f) {
            throw new RuntimeException("There is no 4 in the array!!!");
        }else
            return arr4;
    }
}
