package it.mbm.creational.abstractfactory;

public class CreateWeapon
{
  private WaterWeaponFactory waterWeaponFactory;

  public CreateWeapon(WaterWeaponFactory waterWeaponFactory)
  {
    this.waterWeaponFactory = waterWeaponFactory;
  }

  public WaterPistol createWeapon()
  {
    return waterWeaponFactory.createWeapon();
  }
}
