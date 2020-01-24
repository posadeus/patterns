package it.mbm.builder;

import java.util.Objects;

public class Drawer
{
  private final int width;
  private final int height;
  private final int depth;
  private TieRack tieRack;

  public Drawer(int width, int height, int depth, TieRack tieRack)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
    this.tieRack = tieRack;
  }

  @Override public String toString()
  {
    return "Drawer{" +
        "width=" + width +
        ", height=" + height +
        ", depth=" + depth +
        ", tieRack=" + tieRack +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Drawer drawer = (Drawer) o;
    return width == drawer.width &&
        height == drawer.height &&
        depth == drawer.depth &&
        Objects.equals(tieRack, drawer.tieRack);
  }

  @Override public int hashCode()
  {
    return Objects.hash(width, height, depth, tieRack);
  }
}
