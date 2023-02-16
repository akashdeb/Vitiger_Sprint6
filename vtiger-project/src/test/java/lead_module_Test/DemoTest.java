package lead_module_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(retryAnalyzer = vitiger.genericUtility.RetryAnalyserImplementationClass.class)
	public void demo() {
		System.out.println("Before failure");
		System.out.println("i'm making this change");
		Assert.fail();
		System.out.println("After failure");
	}

}
