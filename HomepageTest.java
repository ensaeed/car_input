package tests;

import tests.com.selenium.Base;
import org.junit.Before;
import org.junit.Test;
import tests.com.pageobjects.Homepage;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ehsun on 31/01/2021
 */
public class HomepageTest extends Base{

    Homepage homepage=new Homepage(driver);



    @Before
    @Test
    public  void validate_homepage(){
    get();

        assertTrue(driver.getTitle().equals("Car Tax Check | Free Car Check"));
    }

    @Test
    public void registrationTest(){

        homepage.registration();
        assertTrue(driver.getTitle().equals("Car Tax Check | Free Vehicle Check  | DN09HRM"));


    }
}
