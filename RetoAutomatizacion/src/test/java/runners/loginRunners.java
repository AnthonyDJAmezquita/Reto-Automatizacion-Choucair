package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions
        (
                features = {"src/test/resources/features/login.feature",
                            "src/test/resources/features/recruitment.feature"},
                //tags = "~@ignore",
                glue = {"stepdefinitions"},
                plugin = "pretty",
                snippets = CucumberOptions.SnippetType.CAMELCASE
        )

@RunWith(CucumberWithSerenity.class)
public class loginRunners  {

}