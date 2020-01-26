package it.mbm.creational.builder;

import java.util.Objects;

public class Ledge
{
  private final int width;
  private final int height;
  private final int depth;

  public Ledge(int width, int height, int depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  @Override public String toString()
  {
    return "Ledge{" +
        "width=" + width +
        ", height=" + height +
        ", depth=" + depth +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Ledge ledge = (Ledge) o;
    return width == ledge.width &&
        height == ledge.height &&
        depth == ledge.depth;
  }

  @Override public int hashCode()
  {
    return Objects.hash(width, height, depth);
  }
}
