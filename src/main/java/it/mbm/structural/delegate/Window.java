package it.mbm.structural.delegate;

public class Window
{
  private Shape shape;

  public Window(Shape shape)
  {
    this.shape = shape;
  }

  public double area()
  {
    return shape.area();
  }
}
