package it.mbm.builder;

import java.util.List;

public class WardrobeBuilder implements Builder<Wardrobe>
{
  private final int width;
  private final int height;
  private final int depth;
  private List<Door> doors;
  private List<Ledge> ledges;
  private List<Drawer> drawers;

  public WardrobeBuilder(int width, int height, int depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public Wardrobe build()
  {
    return new Wardrobe(width, height, depth, doors, ledges, drawers);
  }

  public WardrobeBuilder withDoors(List<Door> doors)
  {
    this.doors = doors;
    return this;
  }

  public WardrobeBuilder withLedges(List<Ledge> ledges)
  {
    this.ledges = ledges;
    return this;
  }

  public WardrobeBuilder withDrawers(List<Drawer> drawers)
  {
    this.drawers = drawers;
    return this;
  }
}
