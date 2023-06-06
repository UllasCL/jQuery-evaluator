package com.ullas.com.jQueryevaluator.operator;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class EqualTest extends TestCase {

  @InjectMocks
  private Equal equal;

  @Test
  public void validTestcase() {
    assertTrue(equal.validate(1, 1));
    assertTrue(equal.validate(1.1, 1.1));
    assertTrue(equal.validate("nuclei", "nuclei"));
  }

  @Test
  public void inValidTestcase() {
    assertFalse(equal.validate(1, 10));
    assertFalse(equal.validate(1, 1.1));
    assertFalse(equal.validate("nuclei", "gonuclei"));
  }
}
