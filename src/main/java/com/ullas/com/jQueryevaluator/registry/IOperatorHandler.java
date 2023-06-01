package com.ullas.com.jQueryevaluator.registry;

public interface IOperatorHandler {

  boolean validate(Object input, Object value);

  void register();
}
