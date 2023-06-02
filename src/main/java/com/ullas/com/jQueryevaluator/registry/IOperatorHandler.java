package com.ullas.com.jQueryevaluator.registry;

public interface IOperatorHandler {

  boolean validate(Object ruleValue, Object inputValue);

  void register();
}
