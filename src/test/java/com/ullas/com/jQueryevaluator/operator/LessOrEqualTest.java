package com.ullas.com.jQueryevaluator.operator;

import java.util.Calendar;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class LessOrEqualTest extends TestCase {

  @InjectMocks
  private LessOrEqual lessOrEqual;

  @Test
  public void validTestcase() {
    assertTrue(lessOrEqual.validate(2, 1));
    assertTrue(lessOrEqual.validate(2, 2));
    assertTrue(lessOrEqual.validate(1.1, 0.9));
    assertTrue(lessOrEqual.validate(1.1, 1.1));
    assertTrue(lessOrEqual.validate("gonuclei", "nuclei"));
    assertTrue(lessOrEqual.validate("gonuclei", "gonuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    Date previousDate = calendar.getTime();
    assertTrue(lessOrEqual.validate(new Date(), previousDate));
  }

  @Test
  public void inValidTestcase() {
    assertFalse(lessOrEqual.validate(1, 2));
    assertFalse(lessOrEqual.validate(1.1, 1.2));
    assertFalse(lessOrEqual.validate("nuclei", "gonuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    Date previousDate = calendar.getTime();
    assertFalse(lessOrEqual.validate(previousDate, new Date()));
  }
}
