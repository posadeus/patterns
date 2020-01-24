package it.mbm.builder;

public class DrawerWithTieRackBuilder implements Builder<Drawer>
{
  @Override public Drawer build()
  {
    TieRack tieRack = new TieRackBuilder(12).build();

    return new Drawer(54, 20, 46, tieRack);
  }
}
