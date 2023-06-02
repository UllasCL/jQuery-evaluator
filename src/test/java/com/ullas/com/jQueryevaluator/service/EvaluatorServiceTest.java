package com.ullas.com.jQueryevaluator.service;

import com.ullas.com.jQueryevaluator.registry.OperatorRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class EvaluatorServiceTest {

  @InjectMocks
  private EvaluatorService evaluatorService;

  @Mock
  private OperatorRegistry operatorRegistry;

  @Mock
  private RulesParserService filterParserService;


  @Test
  public void testValidatorRule(){

  }

}
