import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSteps {

    @Test
    public void isValidName() {
        Assert.assertEquals("Steven", "Steven");
    }
}
