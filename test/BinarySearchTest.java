import Test.BinarySearch;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by Suheng on 7/1/15.
 */
public class BinarySearchTest {
    @Test
    public void testOutput() throws Exception {
        Assert.assertEquals(1, BinarySearch.binarySearch(2, 1, 2, 3, 4));
        Assert.assertEquals(3, BinarySearch.binarySearch(4, 1, 2, 3, 4));
        Assert.assertEquals(0, BinarySearch.binarySearch(1, 1, 2, 3, 4));

    }
}
