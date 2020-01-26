package it.mbm.creational.abstractfactory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AbstractFactoryTest
{
  @Test
  public void waterPistol()
  {
    assertThat(new CreateWeapon(new WaterWeaponFactory(2)).createWeapon(), is(new WaterPistol(2)));
  }
}
