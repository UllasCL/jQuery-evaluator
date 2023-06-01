package com.ullas.com.jQueryevaluator.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ullas.com.jQueryevaluator.bos.RuleSetBo;
import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JsonUtils {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(JsonUtils.class);

  private static final ObjectMapper OBJECT_MAPPER;

  static {
    OBJECT_MAPPER = new ObjectMapper();
    OBJECT_MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
  }

  public static String getString(final Map<Integer, String> data) throws JsonProcessingException {
    return OBJECT_MAPPER.writeValueAsString(data);
  }

  public static RuleSetBo stringToRuleSetBo(final String json) throws Exception {
    try {
      final ObjectMapper mapper = new ObjectMapper();
      return mapper.readValue(json, RuleSetBo.class);
    } catch (Exception exception) {
      LOGGER.error("unable to parse {}", json);
      throw new Exception("error in parsing");
    }
  }
}