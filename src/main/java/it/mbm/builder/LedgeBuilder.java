package it.mbm.builder;

public class LedgeBuilder implements Builder<Ledge>
{
  private final int width;
  private final int height;
  private final int depth;

  public LedgeBuilder(int width, int height, int depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  @Override public Ledge build()
  {
    return new Ledge(width, height, depth);
  }
}
