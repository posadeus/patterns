package it.mbm.builder;

import java.util.List;

public class DoubleDoorWardrobeWithTieRackBuilder
{
  private List<Door> doors;
  private List<Ledge> ledges;
  private List<Drawer> drawers;
  private Wardrobe wardrobe;

  //  @Override public DoubleDoorWardrobeWithTieRackBuilder build()
  //  {
  //    withDoor(30, 176, 2);
  //    withDoor(30, 176, 2);
  //    withLedge(56, 2, 48);
  //    withLedge(56, 2, 48);
  //    withDrawerDirector(54, 20, 46).withTieRack(12).construct();
  //    withDrawer(54, 20, 46);
  //    withDrawer(54, 20, 46);
  //    return this;
  //  }
  //
  //  private DoubleDoorWardrobeWithTieRackBuilder withDoor(int width, int height, int depth)
  //  {
  //    if (doors == null)
  //    {
  //      doors = new ArrayList<>();
  //    }
  //
  //    doors.add(new DoorBuilder(width, height, depth).build().getProduct());
  //
  //    return this;
  //  }
  //
  //  private DoubleDoorWardrobeWithTieRackBuilder withLedge(int width, int height, int depth)
  //  {
  //    if (ledges == null)
  //    {
  //      ledges = new ArrayList<>();
  //    }
  //
  //    ledges.add(new LedgeBuilder(width, height, depth).build().getProduct());
  //
  //    return this;
  //  }
  //
  //  private DoubleDoorWardrobeWithTieRackBuilder withDrawer(int width, int height, int depth)
  //  {
  //    if (drawers == null)
  //    {
  //      drawers = new ArrayList<>();
  //    }
  //
  //    drawers.add(new DrawerBuilder(width, height, depth).build().getProduct());
  //
  //    return this;
  //  }
  //
  //  @Override public Wardrobe getProduct()
  //  {
  //    return null;
  //  }
}
