package it.mbm.creational.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class PotatoPistolFactory extends WeaponFactory
{
  private int capacity;
  private List<Potato> potatoes;
  private RandomGenerator<Integer> randomGenerator;

  public PotatoPistolFactory(int capacity)
  {
    this.capacity = capacity;
    this.potatoes = new ArrayList<>();
    this.randomGenerator = new IntegerRandomGenerator();
  }

  @Override public PotatoPistol createWeapon()
  {
    for (int i = 0; i < capacity; i++)
    {
      potatoes.add(takePotato());
    }

    return new PotatoPistol(potatoes);
  }

  private Potato takePotato()
  {
    return new Potato(randomGenerator.generateRandomNumWith(100));
  }
}
