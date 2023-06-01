package com.ullas.com.jQueryevaluator.operator;

import com.ullas.com.jQueryevaluator.enums.OperatorEnum;
import com.ullas.com.jQueryevaluator.registry.IOperatorHandler;
import com.ullas.com.jQueryevaluator.registry.OperatorRegistry;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Equal implements IOperatorHandler {

  @Autowired
  private OperatorRegistry operatorRegistry;

  @Override
  public boolean validate( Object input, Object value) {
    return Objects.equals(input, value);
  }

  @Override
  public void register() {
    operatorRegistry.register(OperatorEnum.EQUAL.getOperator(),this );
  }
}
