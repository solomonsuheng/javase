import Demo.Fileds;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Suheng on 6/13/15.
 */
public class TestDemo {

    static char[][] matrix = {{'*', '.'}, {'*', '.'}};
    static char[][] matrixError = {{'*'}, {'*', '.'}};


    //测试是否是雷
    @Test
    public void testMineIsTrue() throws Exception {
        Fileds fileds = new Fileds(matrix);
        Assert.assertEquals(true, fileds.check(0, 0));
    }

    @Test
    public void testMineIsFalse() throws Exception {

        Fileds fileds = new Fileds(matrix);
        Assert.assertEquals(false, fileds.check(0, 1));
    }

    @Test
    public void TestOutputTrue() throws Exception {
        Fileds f = new Fileds();
        char[][] except = {{'0', '0'}, {'0', '0'}};

        Assert.assertArrayEquals(except, f.outputMatrix(2, 2));
    }

    @Test
    public void testSetMineTrue() throws Exception {
        Fileds f = new Fileds();
    }

    @Test
    public void testPlusAllDirectionBy1()
            throws Exception {
        Fileds f = new Fileds();
        int[] mineArroundPlusBy1 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] reusltPlusBy1 = {1, 1, 1, 1, 1, 1, 1, 1};


    }

    @Test
    public void testSetMine() throws Exception {
        Fileds f = new Fileds();


        char[][] matrix = {{'.', '.'}, {'.',
                '.'}};
        char[][] result = {{'*', '.'}, {'.',
                '.'}};
        Assert.assertArrayEquals(result, f.setMine(matrix, 0, 0));
    }

    @Test
    public void testFindMine() throws Exception {
        Fileds f = new Fileds();

        char[][] matrix = {{'*', '.'}, {'.',
                '*'}};
        int[][] result = {{0, 0}, {1, 1}};


    }


}
