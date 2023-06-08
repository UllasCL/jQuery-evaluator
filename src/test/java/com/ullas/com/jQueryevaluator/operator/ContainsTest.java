package com.ullas.com.jQueryevaluator.operator;

import java.util.ArrayList;
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
    ArrayList<Integer> integerList= new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);

    ArrayList<String> stringList=new ArrayList<>();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");

    assertTrue(contains.validate(integerList,1));
    assertTrue(contains.validate(stringList,"b"));

  }

  @Test
  public void inValidTestcase() {
    ArrayList<Integer> integerList= new ArrayList<>();
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);

    ArrayList<String> stringList=new ArrayList<>();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");

    assertFalse(contains.validate(integerList,4));
    assertFalse(contains.validate(stringList,"d"));

  }
}
