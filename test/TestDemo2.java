import org.junit.Test;
import org.testng.Assert;
import Demo2.Demo;
/**
 * Created by Suheng on 6/14/15.
 */
public class TestDemo2 {

    @Test
    public void testShowPPT() throws Exception {
        Demo d = new Demo();
        Assert.assertEquals(false, d.init());
    }
}
