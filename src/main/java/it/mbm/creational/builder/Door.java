package it.mbm.creational.builder;

import java.util.Objects;

public class Door
{
  private final int width;
  private final int height;
  private final int depth;

  public Door(int width, int height, int depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  @Override public String toString()
  {
    return "Door{" +
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
    Door door = (Door) o;
    return width == door.width &&
        height == door.height &&
        depth == door.depth;
  }

  @Override public int hashCode()
  {
    return Objects.hash(width, height, depth);
  }
}
