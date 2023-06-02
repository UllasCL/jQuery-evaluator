package com.ullas.com.jQueryevaluator.enums;

public enum OperatorEnum {

  EQUAL("equal");

  private final String operator;

  OperatorEnum(final String operator) {
    this.operator = operator;
  }

  public String getOperator() {
    return operator;
  }
}
