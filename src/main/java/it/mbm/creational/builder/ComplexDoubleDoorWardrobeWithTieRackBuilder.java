package it.mbm.creational.builder;

import static java.util.List.of;

public class ComplexDoubleDoorWardrobeWithTieRackBuilder implements Builder<Wardrobe>
{

  @Override public Wardrobe build()
  {
    Door door1 = new DoorBuilder(30, 176, 2).build();
    Door door2 = new DoorBuilder(30, 176, 2).build();
    Ledge ledge1 = new LedgeBuilder(56, 2, 48).build();
    Ledge ledge2 = new LedgeBuilder(56, 2, 48).build();
    Drawer drawerWithTieRack = new DrawerWithTieRackBuilder().build();
    Drawer drawer1 = new DrawerBuilder(54, 20, 46).build();
    Drawer drawer2 = new DrawerBuilder(54, 20, 46).build();

    return new Wardrobe(60, 180, 50,
                        of(door1, door2),
                        of(ledge1, ledge2),
                        of(drawerWithTieRack, drawer1, drawer2));
  }
}
