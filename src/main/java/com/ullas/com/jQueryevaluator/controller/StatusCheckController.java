package com.ullas.com.jQueryevaluator.controller;

import com.ullas.com.jQueryevaluator.constants.Constants;
import com.ullas.com.jQueryevaluator.service.EvaluatorService;
import com.ullas.com.jQueryevaluator.service.RulesParserService;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCheckController {

  @Autowired
  private EvaluatorService evaluatorService;

  @Autowired
  private RulesParserService rulesParserService;

  private static final Logger LOGGER =
      LoggerFactory.getLogger(StatusCheckController.class);

  @GetMapping(path = {"/evaluate", "/status"}, produces = {MediaType.TEXT_PLAIN_VALUE})
  public ResponseEntity<String> getAppVersion() {

    try {
      var rules = rulesParserService.parseRawRuleSet(Constants.ruleString);
      LOGGER.info("response {}",rules);
      var result =
          evaluatorService.EvaluateRule(rules.getRules()[0]
              ,
              Map.of("price", 10.25));
      LOGGER.info("result {}",result);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return new ResponseEntity<>("running", HttpStatus.OK);
  }
}
