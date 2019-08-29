import com.codeborne.selenide.CollectionCondition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void userCanSearchKeyWord() {
        open("http://automationpractice.com/index.php");
        $(By.cssSelector("#search_query_top")).setValue("dress").pressEnter();
        $$(By.className("lighter")).shouldHave(CollectionCondition.texts("dress"));
    }
}