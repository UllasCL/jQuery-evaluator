package com.ullas.com.jQueryevaluator.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OperatorRegistry implements IRegistry<String, IOperatorHandler> {

  private static final Map<String, IOperatorHandler> OPERATOR_HANDLER_MAP
      = new ConcurrentHashMap<>();

  private static final Logger LOGGER =
      LoggerFactory.getLogger(OperatorRegistry.class);

  @Override
  public void register(final String key, final IOperatorHandler value) {
    OPERATOR_HANDLER_MAP.put(key, value);
  }

  @Override
  public IOperatorHandler get(final String key) {
    if (!OPERATOR_HANDLER_MAP.containsKey(key)) {
      LOGGER.error("### jquery operator not found {}", key);
    }
    return OPERATOR_HANDLER_MAP.get(key);
  }
}
