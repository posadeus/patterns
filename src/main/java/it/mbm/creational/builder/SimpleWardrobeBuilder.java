package it.mbm.creational.builder;

import static java.util.Collections.emptyList;
import static java.util.List.of;

public class SimpleWardrobeBuilder implements Builder<Wardrobe>
{
  @Override public Wardrobe build()
  {
    Door door = new DoorBuilder(30, 176, 2).build();

    return new Wardrobe(30, 180, 50, of(door), emptyList(), emptyList());
  }
}
