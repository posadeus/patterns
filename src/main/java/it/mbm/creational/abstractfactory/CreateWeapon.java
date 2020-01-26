package it.mbm.creational.abstractfactory;

public class CreateWeapon
{
  private WeaponFactory weaponFactory;

  public CreateWeapon(WeaponFactory weaponFactory)
  {
    this.weaponFactory = weaponFactory;
  }

  public Weapon createWeapon()
  {
    return weaponFactory.createWeapon();
  }
}
