package it.mbm.builder;

public class DrawerBuilder implements Builder<Drawer>
{
  private final int width;
  private final int height;
  private final int depth;
  private TieRack tieRack;

  public DrawerBuilder(int width, int height, int depth)
  {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  @Override public Drawer build()
  {
    return new Drawer(width, height, depth, tieRack);
  }

  public DrawerBuilder withTieRack(TieRack tieRack)
  {
    this.tieRack = tieRack;
    return this;
  }
}
