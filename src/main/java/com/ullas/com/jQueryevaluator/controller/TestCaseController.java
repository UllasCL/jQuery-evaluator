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

    final Map userRequest = Map.of("operator", 1, "amount", 20.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase1Rule,
            userRequest);

    LOGGER.info("testCase1a request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test1b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase1b() {

    final Map userRequest = Map.of("operator", 1, "amount", 99.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase1Rule,
            userRequest);

    LOGGER.info("testCase1b request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test2a"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase2a() {

    final Map userRequest = Map.of("operator", 1, "circle", 10);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase2Rule,
            userRequest);

    LOGGER.info("testCase2a request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test2b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase2b() {

    final Map userRequest = Map.of("operator", 1, "circle", 5);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase2Rule,
            userRequest);

    LOGGER.info("testCase2b request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test3a"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase3a() {

    final Map userRequest = Map.of("operator", 1, "base_plan", "4g_data");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase3Rule,
            userRequest);

    LOGGER.info("testCase3a request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test3b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase3b() {

    final Map userRequest = Map.of("operator", 1, "base_plan", "4g");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase3Rule,
            userRequest);

    LOGGER.info("testCase3b request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test4a"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase4a() {

    final Map userRequest = Map.of("operator", 1, "circle", 10, "amount", 99.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase4Rule,
            userRequest);

    LOGGER.info("testCase4a request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test4b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase4b() {

    final Map userRequest = Map.of("operator", 1, "circle", 10, "amount", 101.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase4Rule,
            userRequest);

    LOGGER.info("testCase4b request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test4c"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase4c() {

    final Map userRequest = Map.of("operator", 1, "circle", 5, "amount", 99.00);

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase4Rule,
            userRequest);

    LOGGER.info("testCase4c request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }


  @GetMapping(path = {"/test5a"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase5a() {

    final Map userRequest = Map.of("operator", 1, "circle", 10, "base_plan", "4g_data");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase5Rule,
            userRequest);

    LOGGER.info("testCase5a request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test5b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase5b() {

    final Map userRequest = Map.of("operator", 1, "circle", 5, "base_plan", "4g_data");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase5Rule,
            userRequest);

    LOGGER.info("testCase5b request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test5c"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase5c() {

    final Map userRequest = Map.of("operator", 1, "circle", 10, "base_plan", "4g");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase5Rule,
            userRequest);

    LOGGER.info("testCase5c request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }


  @GetMapping(path = {"/test6a"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase6a() {

    final Map userRequest = Map.of("operator", 1, "circle", 5, "amount", 51.00,"base_plan", "4g");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase6Rule,
            userRequest);

    LOGGER.info("testCase6a request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test6b"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase6b() {

    final Map userRequest = Map.of("operator", 1, "circle", 5, "amount", 49.00,"base_plan", "4g");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase6Rule,
            userRequest);

    LOGGER.info("testCase6b request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test6c"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase6c() {

    final Map userRequest = Map.of("operator", 1, "circle", 5, "amount", 51.00,"base_plan",
        "4g_data");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase6Rule,
            userRequest);

    LOGGER.info("testCase6c request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping(path = {"/test6d"}, produces = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<Boolean> testCase6d() {

    final Map userRequest = Map.of("operator", 1, "circle", 10, "amount", 51.00,"base_plan", "4g");

    var result =
        evaluatorService.EvaluateExpression(TestCaseConstants.testCase6Rule,
            userRequest);

    LOGGER.info("testCase6d request map {} response {}",
        userRequest, result);

    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
