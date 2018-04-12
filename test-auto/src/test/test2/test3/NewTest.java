package test.test2.test3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test2");
  }
  @BeforeClass
  public static void beforeClass() {
	  System.out.println("Before1");
  }

  @AfterClass
  public static void afterClass() {
	  System.out.println("After");
  }

}
