import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Aaron.L.Xu on 2016/4/26.
 */
public class AaronHelloWorldTest {

    private AaronHelloWorld ahw = null;

    @Before
    public void setUp() throws Exception {
        ahw = new AaronHelloWorld();
    }

    @Test
    public void sayHello() throws Exception {
        Assert.assertEquals("Welcome,aaron,it's an amazing club about leetCode.com!", ahw.sayHello("aaron"));
    }
}