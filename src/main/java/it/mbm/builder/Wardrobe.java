package it.mbm.builder;

import java.util.List;
import java.util.Objects;

public class Wardrobe
{
  private final int width;
  private final int height;
  private final int depth;
  private final List<Door> doors;
  private final List<Ledge> ledges;
  private final List<Drawer> drawers;

  public Wardrobe(int width,
                  int height,
                  int depth,
                  List<Door> doors,
                  List<Ledge> ledges,
                  List<Drawer> drawers)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
    this.doors = doors;
    this.ledges = ledges;
    this.drawers = drawers;
  }

  @Override public String toString()
  {
    return "Wardrobe{" +
        "width=" + width +
        ", height=" + height +
        ", depth=" + depth +
        ", doors=" + doors +
        ", ledges=" + ledges +
        ", drawers=" + drawers +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Wardrobe wardrobe = (Wardrobe) o;
    return width == wardrobe.width &&
        height == wardrobe.height &&
        depth == wardrobe.depth &&
        Objects.equals(doors, wardrobe.doors) &&
        Objects.equals(ledges, wardrobe.ledges) &&
        Objects.equals(drawers, wardrobe.drawers);
  }

  @Override public int hashCode()
  {
    return Objects.hash(width, height, depth, doors, ledges, drawers);
  }
}
