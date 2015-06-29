import LeetCode.*;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by Suheng on 6/27/15.
 */
public class LeetCodeTest {
    @Test
    public void testContainsDuplicate() throws Exception {
        Assert.assertEquals(false, ContainsDuplicate.containsDuplicate(1, 2, 3, 4, 5, 6));
        Assert.assertEquals(true, ContainsDuplicate.containsDuplicate(1, 2, 3, 4, 5, 5, 6));
    }

    @Test
    public void testisIsomorphic() throws Exception {
        Assert.assertEquals(true, IsomorphicStrings.isIsomorphic("egg", "add"));
        Assert.assertEquals(true, IsomorphicStrings.isIsomorphic("paper", "title"));
        Assert.assertEquals(false, IsomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    public void testCountPrimes() throws Exception {

        Assert.assertEquals(25, CountPrimes.countPrimes(100));

    }

    @Test
    public void testSingleNumber() throws Exception {
        Assert.assertEquals(1, SingleNumber.singleNumber(1, 2, 2, 3, 3, 4, 4, 5, 5));

    }
}
