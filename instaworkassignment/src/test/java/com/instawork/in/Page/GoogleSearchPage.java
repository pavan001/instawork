package com.instawork.in.Page;

import com.instawork.in.Locators.GoogleLocatorPage;
import com.instawork.in.Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class GoogleSearchPage extends BasePage  {

    public GoogleLocatorPage pages;
    Utility json = new Utility(System.getProperty("user.dir")+"/src/test/java/com/instawork/in/Testdata/testdata.json");

     public GoogleSearchPage(){
         this.pages = new GoogleLocatorPage();
         PageFactory.initElements(driver,this.pages);
     }




     public void getLinks() throws IOException{

        int linkCount = 0;
        pages.searchbox.sendKeys(json.getTestData("testdata.data.search.searchdata"));
        pages.searchbutton.click();
        for(int i =2 ;i<=10;i++) {



            for (WebElement links :pages.sites)

            {
                linkCount++;
                if(links.getText().equalsIgnoreCase(json.getTestData("testdata.data.url.urldata"))) {
                    System.out.println(links.getText() + " present in the index " + linkCount);
                }

            }

            String page = "//*[@aria-label='Page "  + i + "']";
            driver.findElement(By.xpath(page)).click();
        }
    }

}
