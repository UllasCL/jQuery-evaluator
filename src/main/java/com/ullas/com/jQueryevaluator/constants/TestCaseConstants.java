package com.ullas.com.jQueryevaluator.constants;

import java.util.Map;

public class TestCaseConstants {

  public static final String greaterThanAmount50Airtel = "{\n"
      + "    \"condition\": \"AND\",\n"
      + "    \"rules\": [\n"
      + "        {\n"
      + "            \"id\": \"operator\",\n"
      + "            \"field\": \"operator\",\n"
      + "            \"type\": \"integer\",\n"
      + "            \"input\": \"number\",\n"
      + "            \"operator\": \"equal\",\n"
      + "            \"value\": 1\n"
      + "        },\n"
      + "        {\n"
      + "            \"id\": \"amount\",\n"
      + "            \"field\": \"amount\",\n"
      + "            \"type\": \"double\",\n"
      + "            \"input\": \"number\",\n"
      + "            \"operator\": \"greater\",\n"
      + "            \"value\": 50.00\n"
      + "        }\n"
      + "    ],\n"
      + "    \"valid\": true\n"
      + "}}";

}
