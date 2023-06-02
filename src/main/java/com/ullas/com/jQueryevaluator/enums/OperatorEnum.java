package com.ullas.com.jQueryevaluator.enums;

public enum OperatorEnum {

  EQUAL("equal"),
  LESS("less"),
  LESS_OR_EQUAL("less_or_equal"),
  GREATER_OR_EQUAL("greater_or_equal"),
  GREATER("greater");


  private final String operator;

  OperatorEnum(final String operator) {
    this.operator = operator;
  }

  public String getOperator() {
    return operator;
  }
}
