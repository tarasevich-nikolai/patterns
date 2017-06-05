package com.tarasevich.nikolai.structure.flyweight;

public interface Primitive {
  /*
   * Метод отрисовки примитива с передачей заданного контекста рисования
   */
  public void draw(Context context);
}