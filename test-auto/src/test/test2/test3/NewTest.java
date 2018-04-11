package test.test2.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After");
  }

}
