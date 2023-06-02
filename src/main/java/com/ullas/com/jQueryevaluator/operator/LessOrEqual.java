package com.ullas.com.jQueryevaluator.operator;

import com.ullas.com.jQueryevaluator.enums.OperatorEnum;
import com.ullas.com.jQueryevaluator.registry.IOperatorHandler;
import com.ullas.com.jQueryevaluator.registry.OperatorRegistry;
import java.util.Date;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class LessOrEqual implements IOperatorHandler {

  @Autowired
  private OperatorRegistry operatorRegistry;

  public boolean compareValues(Object ruleValue, Object inputValue) {
    if (inputValue == null) {
      return false;
    }
    if (ruleValue instanceof Double) {
      return ((Double) inputValue) <= ((Double) ruleValue);
    } else if (ruleValue instanceof Integer) {
      return ((Integer) inputValue) <= ((Integer) ruleValue);
    } else if (ruleValue instanceof String) {
      return ((String) inputValue).length() <= ((String) ruleValue).length();
    } else if (ruleValue instanceof Date) {
      Date inputDate = (Date) inputValue;
      Date valueDate = (Date) ruleValue;
      return inputDate.before(valueDate) || inputDate.equals(valueDate);
    } else {
      return false;
    }
  }

  @Override
  public boolean validate(final Object ruleValue, final Object input) {
    return false;
  }

  @Override
  @PostConstruct
  public void register() {
    operatorRegistry.register(OperatorEnum.LESS_OR_EQUAL.getOperator(), this);
  }
}

