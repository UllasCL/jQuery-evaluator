package com.ullas.com.jQueryevaluator.service;

import com.ullas.com.jQueryevaluator.bos.RuleBo;
import com.ullas.com.jQueryevaluator.bos.RuleSetBo;
import com.ullas.com.jQueryevaluator.registry.OperatorRegistry;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
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
      switch (ruleSetBo.getCondition()) {
        case AND: {
          return evaluateAndRules(ruleSetBo, dataSet);
        }
        case OR: {
          return evaluateOrRules(ruleSetBo, dataSet);
        }
        default:
          return false;
      }
    } catch (Exception ignore) {
      return false;
    }
  }

  private boolean evaluateOrRules(final RuleSetBo ruleSetBo, final Map<String, Object> dataSet) {
    final AtomicBoolean ok = new AtomicBoolean(false);
    try {
      Arrays.stream(ruleSetBo.getRules()).forEach(rule -> {
        if (operatorRegistry.get(rule.getOperator()).validate(rule.getValue(),
            dataSet.get(rule.getField()))) {
          ok.set(true);
        }
      });
    } catch (Exception ex) {
      ok.set(false);
    }
    return ok.get();
  }

  private boolean evaluateAndRules(final RuleSetBo ruleSetBo, final Map<String, Object> dataSet) {
    final AtomicBoolean ok = new AtomicBoolean(true);
    try {
      Arrays.stream(ruleSetBo.getRules()).forEach(rule -> {
        if (!operatorRegistry.get(rule.getOperator()).validate(rule.getValue(),
            dataSet.get(rule.getField()))) {
          ok.set(false);
        }
      });
    } catch (Exception ex) {
      ok.set(false);
    }
    return ok.get();
  }

  public boolean EvaluateRule(RuleBo rule, Map<String, Object> dataSet) {
    try {
      return operatorRegistry.get(rule.getOperator()).validate(rule.getValue(), dataSet.get(rule
          .getField()));
    } catch (Exception ignore) {
      return false;
    }
  }
}
