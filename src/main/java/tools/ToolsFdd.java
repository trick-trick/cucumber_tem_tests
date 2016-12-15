package tools;

import org.openqa.selenium.WebDriver;
import pages.FddPage;

public class ToolsFdd extends Tools {
    FddPage fddPage = new FddPage(driver);
    public ToolsFdd(WebDriver driver) {
        super(driver);
    }

    public void createComment(){
        fddPage.commentsTab().click();
        fddPage.commentsButton().click();
        fddPage.commentsForm().sendKeys("test");
        fddPage.saveCommentButton().click();
    }
}
