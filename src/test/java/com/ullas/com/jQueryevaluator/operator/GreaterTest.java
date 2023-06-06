package com.ullas.com.jQueryevaluator.operator;

import java.util.Calendar;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class GreaterTest extends TestCase {

  @InjectMocks
  private Greater greater;

  @Test
  public void validTestcase() {
    assertTrue(greater.validate(1, 2));
    assertTrue(greater.validate(1.1, 1.2));
    assertTrue(greater.validate("nuclei", "gonuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, +1);
    Date previousDate = calendar.getTime();
    assertTrue(greater.validate(previousDate, new Date()));
  }

  @Test
  public void inValidTestcase() {
    assertFalse(greater.validate(2, 1));
    assertFalse(greater.validate(1.1, 0.9));
    assertFalse(greater.validate("gonuclei", "nuclei"));
    assertFalse(greater.validate("nuclei", "nuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    Date previousDate = calendar.getTime();
    assertFalse(greater.validate(previousDate, new Date() ));
  }

}
