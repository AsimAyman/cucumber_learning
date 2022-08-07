import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Assem\\Documents\\NetBeansProjects\\cucom\\src\\main\\resources\\features",
        glue = "step_definition"



)
public class Runners {
}
