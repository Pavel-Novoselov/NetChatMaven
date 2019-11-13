package Lesson_7;

public class Test2Main {
    public boolean testArr1_4(int[] arr){
        boolean res=false, res1=false, res4=false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=1&&arr[i]!=4){
                res=false;
                break;
            } else if (arr[i]==1)
                res1=true;
                else if (arr[i]==4)
                    res4=true;
            if(res1&&res4)
                res=true;
        }
        return res;
    }
}
