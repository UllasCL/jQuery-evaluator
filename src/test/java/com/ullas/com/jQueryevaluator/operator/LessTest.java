package com.ullas.com.jQueryevaluator.operator;

import java.util.Calendar;
import java.util.Date;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class LessTest extends TestCase {

  @InjectMocks
  private Less less;

  @Test
  public void validTestcase() {
    assertTrue(less.validate(2, 1));
    assertTrue(less.validate(1.1, 0.9));
    assertTrue(less.validate("gonuclei", "nuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    Date previousDate = calendar.getTime();
    assertTrue(less.validate(new Date(), previousDate));
  }

  @Test
  public void inValidTestcase() {
    assertFalse(less.validate(1, 2));
    assertFalse(less.validate(1.1, 1.1));
    assertFalse(less.validate("nuclei", "gonuclei"));
    assertFalse(less.validate("nuclei", "nuclei"));
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    Date previousDate = calendar.getTime();
    assertFalse(less.validate(previousDate, new Date()));
  }
}
