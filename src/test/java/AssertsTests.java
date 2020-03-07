import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsTests {
    @Test
    public void testArrays(){
        Object[] firstArray = new Object[]{ 1,2,3,4,5,6,7,8,9,10 };
        Object[] secondArray = new Object[]{ 1,3,2,4,5,6,7,8,9,10 };
        Assert.assertEqualsNoOrder( firstArray, secondArray );

    }
}
