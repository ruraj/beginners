package np.com.rts.internship.beginners;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ruraj on 5/18/16.
 */
public class TestAnswer {

  @Test
  public void testAnswer() {
    Main main = new Main();

    Assert.assertEquals("Answer incorrect", "zxcvb", main.strings[main.strings.length-1]);
  }
}
