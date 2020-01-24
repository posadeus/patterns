package it.mbm.builder;

public class TieRackBuilder implements Builder<TieRack>
{
  private int numOfTieRacks;

  public TieRackBuilder(int numOfTieRacks)
  {
    this.numOfTieRacks = numOfTieRacks;
  }

  @Override public TieRack build()
  {
    return new TieRack(numOfTieRacks);
  }
}
