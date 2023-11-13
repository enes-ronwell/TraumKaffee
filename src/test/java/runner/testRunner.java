package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        tags = "not @ProductDetailPage and not @ProductsPage and not ShoppingCartPage and not @HomePage and not @WhosalePage",
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "utils"},
        plugin = {
                "summary",
                "html:target/cucumber-reports.html"
        },
        monochrome = true
)
public class testRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}