package com.ullas.com.jQueryevaluator.bos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RuleBo {

  @JsonProperty("id")
  private String id;

  @JsonProperty("field")
  private String field;

  @JsonProperty("type")
  private String type;

  @JsonProperty("input")
  private String input;

  @JsonProperty("operator")
  private String operator;

  @JsonProperty("value")
  private Object value;

  @Override
  public String toString() {
    return "Rule{" +
        "ID='" + id + '\'' +
        ", field='" + field + '\'' +
        ", type='" + type + '\'' +
        ", input='" + input + '\'' +
        ", operator='" + operator + '\'' +
        ", value=" + value +
        '}';
  }
}
