package junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DateTest.class, DateValidationTest.class, LicenseNumberTest.class, LicenseValidationTest.class,
		TimeTest.class, TimeValidationTest.class })
public class AllTests {

}
