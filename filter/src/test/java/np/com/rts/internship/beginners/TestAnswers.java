package np.com.rts.internship.beginners;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ruraj on 5/18/16.
 */
public class TestAnswers {

  @Test
  public void testAnswers() {
    Main main = new Main();

    Assert.assertEquals("Herbivore count mismatch", main.herbivores.size(), 3);
    Assert.assertEquals("Carnivore count mismatch", main.carnivores.size(), 4);
    Assert.assertEquals("Omnivore count mismatch", main.omnivores.size(), 1);
  }
}
