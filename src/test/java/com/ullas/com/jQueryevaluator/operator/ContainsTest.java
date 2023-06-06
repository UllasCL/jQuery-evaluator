package com.ullas.com.jQueryevaluator.operator;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ContainsTest extends TestCase {

  @InjectMocks
  private Contains contains;

  @Test
  public void validTestcase() {
    int[] input = {1, 2, 3};
    String[] inputString = {"a","b","c"};
    assertTrue(contains.validate(input,1));
    assertTrue(contains.validate(inputString,"b"));

  }
}
