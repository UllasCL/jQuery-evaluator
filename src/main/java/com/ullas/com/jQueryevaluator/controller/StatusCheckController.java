package com.ullas.com.jQueryevaluator.controller;

import com.ullas.com.jQueryevaluator.constants.Constants;
import com.ullas.com.jQueryevaluator.service.EvaluatorService;
import com.ullas.com.jQueryevaluator.service.RulesParserService;
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
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var lessThanAmount50Airtel =
          evaluatorService.EvaluateExpression(Constants.lessThanAmount50Airtel,
              Constants.lessThanAmount50AirtelMap);

      LOGGER.info("lessThanAmount50Airtel request map {} response {}",
          Constants.lessThanAmount50AirtelMap, lessThanAmount50Airtel);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var greaterThanAmount50Airtel =
          evaluatorService.EvaluateExpression(Constants.greaterThanAmount50Airtel,
              Constants.greaterThanAmount50AirtelMap);

      LOGGER.info("greaterThanAmount50Airtel request map {} response {}",
          Constants.greaterThanAmount50AirtelMap, greaterThanAmount50Airtel);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var lessOrEqualThanAmount50Airtel =
          evaluatorService.EvaluateExpression(Constants.lessOrEqualThanAmount50Airtel,
              Constants.lessOrEqualThanAmount50AirtelMap);

      LOGGER.info("lessOrEqualThanAmount50Airtel request map {} response {}",
          Constants.lessOrEqualThanAmount50AirtelMap, lessOrEqualThanAmount50Airtel);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var greaterOrEqualThanAmount50Airtel =
          evaluatorService.EvaluateExpression(Constants.greaterOrEqualThanAmount50Airtel,
              Constants.greaterOrEqualThanAmount50AirtelMap);

      LOGGER.info("greaterOrEqualThanAmount50Airtel request map {} response {}",
          Constants.greaterOrEqualThanAmount50AirtelMap, greaterOrEqualThanAmount50Airtel);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var circle10Airtel =
          evaluatorService.EvaluateExpression(Constants.circle10Airtel,
              Constants.circle10AirtelMap);

      LOGGER.info("circle10Airtel request map {} response {}",
          Constants.circle10AirtelMap, circle10Airtel);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var greaterThanAmount50AirtelCircleKarnataka =
          evaluatorService.EvaluateExpression(Constants.greaterThanAmount50AirtelCircleKarnataka,
              Constants.greaterThanAmount50AirtelCircleKarnatakaMap);

      LOGGER.info("greaterThanAmount50AirtelCircleKarnataka request map {} response {}",
          Constants.greaterThanAmount50AirtelCircleKarnatakaMap,
          greaterThanAmount50AirtelCircleKarnataka);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var lessOrEqualThanAmount50AirtelCircleKarnataka =
          evaluatorService.EvaluateExpression(
              Constants.lessOrEqualThanAmount50AirtelCircleKarnataka,
              Constants.lessOrEqualThanAmount50AirtelCircleKarnatakaMap);

      LOGGER.info("lessOrEqualThanAmount50AirtelCircleKarnataka request map {} response {}",
          Constants.lessOrEqualThanAmount50AirtelCircleKarnatakaMap,
          lessOrEqualThanAmount50AirtelCircleKarnataka);
      LOGGER.info("\n-----------------------------------------------------------------------\n");

      var invalidLessOrEqualThanAmount50AirtelCircleKarnataka =
          evaluatorService.EvaluateExpression(
              Constants.lessOrEqualThanAmount50AirtelCircleKarnataka,
              Constants.invalidLessOrEqualThanAmount50AirtelCircleKarnatakaMap);

      LOGGER.info("invalid lessOrEqualThanAmount50AirtelCircleKarnataka request map {} response {}",
          Constants.invalidLessOrEqualThanAmount50AirtelCircleKarnatakaMap,
          invalidLessOrEqualThanAmount50AirtelCircleKarnataka);
      LOGGER.info("\n-----------------------------------------------------------------------\n");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return new ResponseEntity<>("running", HttpStatus.OK);
  }
}
