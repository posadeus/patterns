package it.mbm.builder;

import java.util.ArrayList;
import java.util.List;

public class StandardWardrobeBuilder implements IWardrobeBuilder
{
  private Wardrobe wardrobe;
  private List<Door> doors;
  private List<Ledge> ledges;
  private List<Drawer> drawers;
  private TieRack tieRack;

  public StandardWardrobeBuilder()
  {
    this.wardrobe = null;
    this.doors = new ArrayList<>();
    this.ledges = new ArrayList<>();
    this.drawers = new ArrayList<>();
    this.tieRack = null;
  }

  @Override public void buildWardrobe(int width, int height, int depth)
  {
    this.wardrobe = new Wardrobe(width, height, depth, doors, ledges, drawers);
  }

  @Override public void buildDoor(int width, int height, int depth)
  {
    doors.add(new Door(width, height, depth));
  }

  @Override public void buildLedge(int width, int height, int depth)
  {
    ledges.add(new Ledge(width, height, depth));
  }

  @Override public void buildTieRack(int numOfTieRacks)
  {
    tieRack = new TieRack(numOfTieRacks);
  }

  @Override public void buildDrawer(int width, int height, int depth, boolean withTieRack)
  {
    if (withTieRack)
    {
      drawers.add(new Drawer(width, height, depth, tieRack));
    }
    else
    {
      drawers.add(new Drawer(width, height, depth, null));
    }
  }

  @Override public Wardrobe getWardrobe()
  {
    return wardrobe;
  }
}
