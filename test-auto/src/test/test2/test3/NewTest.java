package test.test2.test3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void firstTest() {
	  System.out.println("Test1");
  }
  @Test
  public void secondTest() {
	  System.out.println("Test2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After");
  }

}
