package it.mbm.structural.delegate;

public class RectangularShape implements Shape
{
  private final int width;
  private final int height;

  public RectangularShape(int width, int height)
  {
    this.width = width;
    this.height = height;
  }

  public double area()
  {
    return width * height;
  }
}

