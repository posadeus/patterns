package it.mbm.creational.builder;

public class CreateWardrobe
{
  public static Wardrobe createSimpleWardrobe(IWardrobeBuilder builder)
  {
    builder.buildDoor(30, 176, 2);
    builder.buildWardrobe(30, 180, 50);

    return builder.getWardrobe();
  }

  public static Wardrobe createComplexWardrobe(IWardrobeBuilder builder)
  {
    builder.buildDoor(30, 176, 2);
    builder.buildDoor(30, 176, 2);
    builder.buildLedge(56, 2, 48);
    builder.buildLedge(56, 2, 48);
    builder.buildTieRack(12);
    builder.buildDrawer(54, 20, 46, true);
    builder.buildDrawer(54, 20, 46, false);
    builder.buildDrawer(54, 20, 46, false);
    builder.buildWardrobe(60, 180, 50);

    return builder.getWardrobe();
  }
}
