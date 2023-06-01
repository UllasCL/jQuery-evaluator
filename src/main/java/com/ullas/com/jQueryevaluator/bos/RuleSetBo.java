package com.ullas.com.jQueryevaluator.bos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ullas.com.jQueryevaluator.enums.BooleanOperator;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public
class RuleSetBo {

  @JsonProperty("condition")
  private BooleanOperator condition;

  @JsonProperty("rules")
  private RuleBo[] rules;

  @JsonProperty("valid")
  private boolean valid;

}
