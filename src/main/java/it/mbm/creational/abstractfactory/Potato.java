package it.mbm.creational.abstractfactory;

import java.util.Objects;

public class Potato
{
  private int grams;

  public Potato(int grams)
  {
    this.grams = grams;
  }

  @Override public String toString()
  {
    return "Potato{" +
        "grams=" + grams +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Potato potato = (Potato) o;
    return grams == potato.grams;
  }

  @Override public int hashCode()
  {
    return Objects.hash(grams);
  }
}
