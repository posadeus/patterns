package it.mbm.builder;

public class DoorBuilder implements Builder<Door>
{
  private final int width;
  private final int height;
  private final int depth;

  public DoorBuilder(int width, int height, int depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  @Override public Door build()
  {
    return new Door(width, height, depth);
  }
}
