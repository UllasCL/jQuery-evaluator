package com.ullas.com.jQueryevaluator.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class OperatorRegistry implements IRegistry<String, IOperatorHandler> {

  private static final Map<String, IOperatorHandler> OPERATOR_HANDLER_MAP
      = new ConcurrentHashMap<>();

  @Override
  public void register(final String key, final IOperatorHandler value) {
    OPERATOR_HANDLER_MAP.put(key, value);
  }

  @Override
  public IOperatorHandler get(final String key) throws Exception {
    if (!OPERATOR_HANDLER_MAP.containsKey(key)) {
      throw new Exception("Operator handler not present for vendor " + key);
    }
    return OPERATOR_HANDLER_MAP.get(key);
  }
}
