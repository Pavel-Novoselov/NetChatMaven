import Lesson_7.Test2Main;
import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@RunWith(Parameterized.class)
public class ArrMasTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0,0,0},
                {1,1,1},
                {4,4,4},
                {1,4,2},
                {2,4,1}
        });
    }

    private int a,b,c;

    public ArrMasTest(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    private Test2Main test2Main;

    @Before
    public void init(){
        test2Main = new Test2Main();
    }

    @Test
    public void test(){
        int [] arr = {a,b,c};
        Assert.assertFalse(test2Main.testArr1_4(arr));
    }
}
