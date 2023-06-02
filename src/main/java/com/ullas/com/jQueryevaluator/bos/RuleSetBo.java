package com.ullas.com.jQueryevaluator.bos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ullas.com.jQueryevaluator.enums.BooleanOperator;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RuleSetBo {

  @NotBlank
  @JsonProperty("condition")
  private BooleanOperator condition;

  @NotBlank
  @JsonProperty("rules")
  private RuleBo[] rules;

  @NotBlank
  @JsonProperty("valid")
  private boolean valid;

}
