package it.mbm.creational.abstractfactory;

import java.util.Objects;

public class WaterPistol
{
  private int capacity;

  public WaterPistol(int capacity)
  {
    this.capacity = capacity;
  }

  @Override public String toString()
  {
    return "WaterPistol{" +
        "capacity=" + capacity +
        '}';
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    WaterPistol that = (WaterPistol) o;
    return capacity == that.capacity;
  }

  @Override public int hashCode()
  {
    return Objects.hash(capacity);
  }
}
