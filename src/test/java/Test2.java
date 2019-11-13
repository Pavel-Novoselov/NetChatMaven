import Lesson_7.Test2Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
    Test2Main test2Main;

    @Before
    public void init(){
        test2Main = new Test2Main();
    }

    @Test
    public void test1(){
        int[] arrIn = {1,2,3,4,5,6,7};
        Assert.assertFalse(test2Main.testArr1_4(arrIn));
    }

    @Test
    public void test2(){
        int[] arrIn = {1,4,1,1,1,4,4,4,1};
        Assert.assertTrue(test2Main.testArr1_4(arrIn));
    }

    @Test
    public void test3(){
        int[] arrIn = {1,4,2};
        Assert.assertFalse(test2Main.testArr1_4(arrIn));
    }
    @Test
    public void test4(){
        int[] arrIn = {4,4,4,4};
        Assert.assertFalse(test2Main.testArr1_4(arrIn));
    }
}
