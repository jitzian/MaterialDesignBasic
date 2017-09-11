package mac.training.android.com.org.materialdesignbasic.model;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by raian on 9/10/17.
 */

//@Config(emulateSdk = 18, reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class PersonTest {

    @Test
    public void personCreationTest(){
        Person person = new Person("Bruce", "Wayne", "");
        Assert.assertEquals("Bruce", person.getName());
        Assert.assertEquals("Wayne", person.getLastName());
        Assert.assertEquals("", person.getUrlImg());
    }

}
