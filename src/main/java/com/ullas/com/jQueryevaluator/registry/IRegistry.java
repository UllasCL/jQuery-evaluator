package com.ullas.com.jQueryevaluator.registry;

public interface IRegistry<P, Q> {

  void register(final P key, final Q value);

  Q get(final P key) throws Exception;
}
