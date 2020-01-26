package it.mbm.creational.abstractfactory;

public class WaterWeaponFactory extends WeaponFactory
{
  private int capacity;

  public WaterWeaponFactory(int capacity)
  {
    this.capacity = capacity;
  }

  public WaterPistol createWeapon()
  {
    return new WaterPistol(capacity);
  }
}
