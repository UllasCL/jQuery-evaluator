package com.ullas.com.jQueryevaluator.service;

import com.ullas.com.jQueryevaluator.bos.RuleSetBo;
import com.ullas.com.jQueryevaluator.registry.OperatorRegistry;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EvaluatorService {

  @Autowired
  private OperatorRegistry operatorRegistry;

  @Autowired
  private FilterParserService filterParserService;

  public boolean EvaluateExpression(String rules, Map<String, Object> dataSet) {
    try {

      RuleSetBo ruleSetBo = filterParserService.parseRawRuleSet(rules);

    } catch (Exception ignore) {

    }
    return true;
  }
}
