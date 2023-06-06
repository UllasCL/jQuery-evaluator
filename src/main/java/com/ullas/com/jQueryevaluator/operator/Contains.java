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
    Class<?> inputClass = ruleValue.getClass();

    if (inputClass == String.class) {
      String inputString = (String) ruleValue;
      String valueString = (String) inputValue;

      return inputString.contains(valueString);
    } else if (inputClass.isArray()) {
      int length = Array.getLength(ruleValue);

      for (int i = 0; i < length; i++) {
        Object element = Array.get(ruleValue, i);

        if (element.equals(inputValue)) {
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
