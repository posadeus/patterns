package it.mbm.creational.abstractfactory;

import java.util.List;
import java.util.Objects;

public class PotatoPistol implements Weapon
{

  private List<Potato> potatoes;

  public PotatoPistol(List<Potato> potatoes)
  {
    this.potatoes = potatoes;
  }

  @Override public String toString()
  {
    return "PotatoPistol{" +
        "potatoes=" + potatoes +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    PotatoPistol that = (PotatoPistol) o;
    return Objects.equals(potatoes, that.potatoes);
  }

  @Override public int hashCode()
  {
    return Objects.hash(potatoes);
  }
}
