package it.mbm.delegate;

import static java.lang.Math.PI;

public class CircularShape implements Shape
{
  private int radius;

  public CircularShape(int radius)
  {
    this.radius = radius;
  }

  public double area()
  {
    return PI * radius * radius;
  }
}

