package com.ullas.com.jQueryevaluator.constants;

import java.util.Map;

public class Constants {

  public static final String lessThanAmount50Airtel = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"amount\",\n"
      + "      \"field\": \"amount\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"less\",\n"
      + "      \"value\": 50.00\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static final Map lessThanAmount50AirtelMap = Map.of("operator", 1, "amount", 49.00);

  public static final String greaterThanAmount50Airtel = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"amount\",\n"
      + "      \"field\": \"amount\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"greater\",\n"
      + "      \"value\": 50.00\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static final Map greaterThanAmount50AirtelMap = Map.of("operator", 1, "amount", 99.00);

  public static final String lessOrEqualThanAmount50Airtel = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"amount\",\n"
      + "      \"field\": \"amount\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"less_or_equal\",\n"
      + "      \"value\": 50.00\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static final Map lessOrEqualThanAmount50AirtelMap = Map.of("operator", 1, "amount", 50.00);

  public static final String greaterOrEqualThanAmount50Airtel = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"amount\",\n"
      + "      \"field\": \"amount\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"greater_or_equal\",\n"
      + "      \"value\": 50.00\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static final Map greaterOrEqualThanAmount50AirtelMap = Map.of("operator", 1, "amount",
      50.00);

  public static final String circle10Airtel = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"circle\",\n"
      + "      \"field\": \"circle\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 10\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static Map<String, Object> circle10AirtelMap = Map.of("circle", 10, "operator", 1);

  public static final String greaterThanAmount50AirtelCircleKarnataka = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"amount\",\n"
      + "      \"field\": \"amount\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"greater\",\n"
      + "      \"value\": 50.00\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"circle\",\n"
      + "      \"field\": \"circle\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 10\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static Map<String, Object> greaterThanAmount50AirtelCircleKarnatakaMap = Map.of("circle",
      10, "operator", 1, "amount", 719.00);


  public static final String lessOrEqualThanAmount50AirtelCircleKarnataka = "{\n"
      + "  \"condition\": \"AND\",\n"
      + "  \"rules\": [\n"
      + "    {\n"
      + "      \"id\": \"amount\",\n"
      + "      \"field\": \"amount\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"less_or_equal\",\n"
      + "      \"value\": 50.00\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"circle\",\n"
      + "      \"field\": \"circle\",\n"
      + "      \"type\": \"double\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 10\n"
      + "    },\n"
      + "    {\n"
      + "      \"id\": \"operator\",\n"
      + "      \"field\": \"operator\",\n"
      + "      \"type\": \"integer\",\n"
      + "      \"input\": \"number\",\n"
      + "      \"operator\": \"equal\",\n"
      + "      \"value\": 1\n"
      + "    }\n"
      + "  ],\n"
      + "  \"valid\": true\n"
      + "}";

  public static Map<String, Object> lessOrEqualThanAmount50AirtelCircleKarnatakaMap = Map.of(
      "circle", 10, "operator", 1, "amount", 19.00);

  public static Map<String, Object> invalidLessOrEqualThanAmount50AirtelCircleKarnatakaMap = Map.of(
      "circle", 10, "operator", 1, "amount", 719.00);
}
