package co.com.choucair.financial.utestchallenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_a_new_user.feature",
        tags = "@createNewCount",
        glue = "co.com.choucair.financial.utestchallenge.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnersTags {
}
