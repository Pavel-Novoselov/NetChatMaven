import Lesson_7.Test1Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
    private Test1Main test1Main;

    @Before
    public void beforeTest(){
        test1Main = new Test1Main();
    }

    @Test
    public void test1(){
        int[] arrIn = {1,2,3,4,5,6,7};
        int[] arrOut = {5,6,7};
        Assert.assertArrayEquals(arrOut, test1Main.after4(arrIn));
    }

    @Test
    public void test2(){
        int[] arrIn = {1,2,3,5,6,7,4};
        int[] arrOut = {};
        Assert.assertArrayEquals(arrOut, test1Main.after4(arrIn));
    }

    @Test
    public void test3(){
        int[] arrIn = {4,1,2,3,5,6,7};
        int[] arrOut = {1,2,3,5,6,7};
        Assert.assertArrayEquals(arrOut, test1Main.after4(arrIn));
    }

    @Test(expected = RuntimeException.class)
    public void test4(){
        int[] arrIn = {1,2,3,5,6,7};
        int[] arrOut = null;
        Assert.assertArrayEquals(arrOut, test1Main.after4(arrIn));
    }


}
