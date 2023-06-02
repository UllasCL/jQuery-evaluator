package com.ullas.com.jQueryevaluator.service;

import com.ullas.com.jQueryevaluator.bos.RuleBo;
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
  private RulesParserService filterParserService;

  public boolean EvaluateExpression(String rules, Map<String, Object> dataSet) {
    try {
      RuleSetBo ruleSetBo = filterParserService.parseRawRuleSet(rules);
      //TODO validate all the rules once, Not required for now.
    } catch (Exception ignore) {

    }
    return true;
  }

  public boolean EvaluateRule(RuleBo rule, Map<String, Object> dataSet) {
    try {
      return operatorRegistry.get(rule.getOperator()).validate(rule.getValue(), dataSet.get(rule
          .getField()));
    } catch (Exception ignore) {

    }
    return true;
  }
}
