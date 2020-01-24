package it.mbm.builder;

import java.util.Objects;

public class TieRack
{
  private int numOfTieRacks;

  public TieRack(int numOfTieRacks)
  {
    this.numOfTieRacks = numOfTieRacks;
  }

  @Override public String toString()
  {
    return "TieRack{" +
        "numOfTieRacks=" + numOfTieRacks +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    TieRack tieRack = (TieRack) o;
    return numOfTieRacks == tieRack.numOfTieRacks;
  }

  @Override public int hashCode()
  {
    return Objects.hash(numOfTieRacks);
  }
}
