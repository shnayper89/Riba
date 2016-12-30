package Utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by spirit on 30.12.16.
 */
public class ScrollPage {
    ElementsCollection stringWithNumberOfProduct = $$(".search_result > span");
    SelenideElement moreResultsButtonLoader = $(".loader_block.width_loader center");
    SelenideElement moreResultsButton = $("#more_results");

    public void scroll() throws InterruptedException {
        String numberOfProduct = stringWithNumberOfProduct.get(0).getText();
        System.out.println(numberOfProduct);
        int numberOfLoop;
        int residue  =  Integer.parseInt(numberOfProduct)%20;
        System.out.println(residue);
            if (residue > 0)
                numberOfLoop = Integer.parseInt(numberOfProduct)/20 + 1;
            else
                numberOfLoop = Integer.parseInt(numberOfProduct)/20;
        System.out.println(numberOfLoop);
            for (int i = 0, f =20; i < numberOfLoop; i++, f = f + 20 ){

                executeJavaScript("window.scrollBy(0,3000)", "");
                            System.out.println("OPUSTILL!!!!      " + (i + 1));


                for (int k=0; ;k++ ){
                    ElementsCollection itemName = $$(".prod_name");
                    if ((itemName.size() == f)||i == numberOfLoop-1) break;

                }
            }
    }
}
