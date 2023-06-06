package com.ullas.com.jQueryevaluator.operator;

import com.ullas.com.jQueryevaluator.enums.OperatorEnum;
import com.ullas.com.jQueryevaluator.registry.IOperatorHandler;
import com.ullas.com.jQueryevaluator.registry.OperatorRegistry;
import java.lang.reflect.Array;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Contains implements IOperatorHandler {

  @Autowired
  private OperatorRegistry operatorRegistry;

  @Override
  public boolean validate(final Object ruleValue, final Object inputValue) {
    Class<?> inputValueClass = inputValue.getClass();

    if (inputValueClass == String.class) {
      String inputValueString = (String) inputValue;
      String valueString = (String) ruleValue;

      return inputValueString.contains(valueString);
    } else if (inputValueClass.isArray()) {
      int length = Array.getLength(inputValue);

      for (int i = 0; i < length; i++) {
        Object element = Array.get(inputValue, i);

        if (element.equals(ruleValue)) {
          return true;
        }
      }
    } else {
      return false;
    }

    return false;
  }


@Override
  @PostConstruct
  public void register() {
    operatorRegistry.register(OperatorEnum.CONTAINS.getOperator(), this);
  }
}
