package com.ullas.com.jQueryevaluator.controller;

import com.ullas.com.jQueryevaluator.constants.TestCaseConstants;
import com.ullas.com.jQueryevaluator.service.EvaluatorService;
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
public class TestCaseController {


  @Autowired
  private EvaluatorService evaluatorService;

  private static final Logger LOGGER =
      LoggerFactory.getLogger(StatusCheckController.class);

  @GetMapping(path = {"/test1a"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase1a() {

    final Map lessThanAmount50AirtelMap = Map.of("operator", 1, "amount", 20.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.greaterThanAmount50Airtel,
            lessThanAmount50AirtelMap);

    LOGGER.info("greaterThanAmount50Airtel request map {} response {}",
        lessThanAmount50AirtelMap, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test1b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase2b() {

    final Map greaterThanAmount50AirtelMap = Map.of("operator", 1, "amount", 99.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.greaterThanAmount50Airtel,
            greaterThanAmount50AirtelMap);

    LOGGER.info("greaterThanAmount50Airtel request map {} response {}",
        greaterThanAmount50AirtelMap, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

}
