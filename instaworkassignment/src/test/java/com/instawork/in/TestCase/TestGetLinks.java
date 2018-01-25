package com.instawork.in.TestCase;

import com.instawork.in.Page.BasePage;
import com.instawork.in.Page.GoogleSearchPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestGetLinks {
 @Parameters("browser")
@BeforeClass
public void setUp(String browser){
     BasePage.initConfiguration(browser);

}


    @Test
    public void testGetLinks() throws IOException{

        GoogleSearchPage page = new GoogleSearchPage();
        page.getLinks();




    }

    @AfterClass
    public void tearDown(){
BasePage.quitBrowser();
    }
}
