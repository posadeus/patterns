package it.mbm.builder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BuilderTest
{
  @Test
  public void wardrobeConstruction()
  {
    Door door1 = new Door(30, 176, 2);
    Door door2 = new Door(30, 176, 2);

    List<Door> doors = new ArrayList<>();
    doors.add(door1);
    doors.add(door2);

    Ledge ledge1 = new Ledge(56, 2, 48);
    Ledge ledge2 = new Ledge(56, 2, 48);

    List<Ledge> ledges = new ArrayList<>();
    ledges.add(ledge1);
    ledges.add(ledge2);

    TieRack tieRack = new TieRack(12);

    Drawer drawer1 = new Drawer(54, 20, 46, tieRack);
    Drawer drawer2 = new Drawer(54, 20, 46, null);
    Drawer drawer3 = new Drawer(54, 20, 46, null);

    List<Drawer> drawers = new ArrayList<>();
    drawers.add(drawer1);
    drawers.add(drawer2);
    drawers.add(drawer3);

    assertThat(new WardrobeBuilder(60, 180, 50)
                   .withDoors(of(new DoorBuilder(30, 176, 2).build(),
                                 new DoorBuilder(30, 176, 2).build()))
                   .withLedges(of(new LedgeBuilder(56, 2, 48).build(),
                                  new LedgeBuilder(56, 2, 48).build()))
                   .withDrawers(of(new DrawerBuilder(54, 20, 46)
                                       .withTieRack(new TieRackBuilder(12).build())
                                       .build(),
                                   new DrawerBuilder(54, 20, 46).build(),
                                   new DrawerBuilder(54, 20, 46).build()))
                   .build(),
               is(new Wardrobe(60, 180, 50, doors, ledges, drawers)));
  }
}