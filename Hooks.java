package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void startExecution() {
        System.out.println("==== Script Start Execution ====");
    }

    @After
    public void endExecution() {
        System.out.println("==== Script End Execution ====");
    }
}
