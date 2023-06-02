package com.ullas.com.jQueryevaluator.service;

import com.ullas.com.jQueryevaluator.bos.RuleSetBo;
import com.ullas.com.jQueryevaluator.utils.JsonUtils;
import org.springframework.stereotype.Component;

@Component
public class RulesParserService {

  public RuleSetBo parseRawRuleSet(final String rawRuleSet) throws Exception {
    return JsonUtils.stringToRuleSetBo(rawRuleSet);
  }
}
