package vitiger.genericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int generateRandomNo(int limit) {
		return new Random().nextInt(limit);
	}
	
	public String generateSysDateTime() {
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}

}
