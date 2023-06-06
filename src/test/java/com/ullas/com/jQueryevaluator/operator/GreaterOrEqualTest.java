package com.ullas.com.jQueryevaluator.operator;

import java.util.Calendar;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class GreaterOrEqualTest extends TestCase {

  @InjectMocks
  private GreaterOrEqual greaterOrEqual;

  @Test
  public void validTestcase() {
    assertTrue(greaterOrEqual.validate(1, 2));
    assertTrue(greaterOrEqual.validate(1, 1));
    assertTrue(greaterOrEqual.validate(1.1, 1.2));
    assertTrue(greaterOrEqual.validate(1.1, 1.1));
    assertTrue(greaterOrEqual.validate("nuclei", "gonuclei"));
    assertTrue(greaterOrEqual.validate("gonuclei", "gonuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, +1);
    Date tomorrow = calendar.getTime();
    assertTrue(greaterOrEqual.validate(new Date(), tomorrow));
  }

  @Test
  public void inValidTestcase() {
    assertFalse(greaterOrEqual.validate(2, 1));
    assertFalse(greaterOrEqual.validate(1.1, 0.9));
    assertFalse(greaterOrEqual.validate("gonuclei", "nuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    Date previousDate = calendar.getTime();
    assertFalse(greaterOrEqual.validate(new Date(), previousDate));
  }

}
