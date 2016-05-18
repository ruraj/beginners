package np.com.rts.internship.beginners;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ruraj on 5/18/16.
 */
public class TestAnswers {

  @Test
  public void testAnswer() {
    Main main = new Main();

    Assert.assertEquals("Answer incorrect", 3.0, main.value, 0);
  }
}
