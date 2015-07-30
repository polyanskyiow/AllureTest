package my.company;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.fail;


/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 24.11.13
 */
public class SimpleTest {
    @Test
    public void simpleTest() {
        
    }

   

    @Test
    public void simpleTestWithSteps() {
      
    }


    @Test (enabled = false)
    public void simpleTestWithAttachments() throws Exception {

    }

    @Test
    public void failedTest() {
      fail();
    }
  

    @Test
    public void csvAttachmentTest() throws Exception {
    }

    
}

