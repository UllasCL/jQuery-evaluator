package com.ullas.com.jQueryevaluator.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class FilterParserServiceTest {

  @InjectMocks
  private FilterParserService filterParserService;

  private static final String ruleString = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"price\",\n"
      + "      \"field\": \"price\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"less\",\n"
      + "      \"value\": 10.25\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  @Test
  public void testParser() {
    try {
      var response = filterParserService.parseRawRuleSet(ruleString);
      System.out.println(response);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
