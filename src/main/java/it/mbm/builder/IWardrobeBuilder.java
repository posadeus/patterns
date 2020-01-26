package it.mbm.builder;

public interface IWardrobeBuilder
{
  void buildWardrobe(int width, int height, int depth);

  void buildDoor(int width, int height, int depth);

  void buildLedge(int width, int height, int depth);

  void buildTieRack(int numOfTieRacks);

  void buildDrawer(int width, int height, int depth, boolean withTieRack);

  Wardrobe getWardrobe();
}
