package it.mbm.creational.abstractfactory;

import java.util.Random;

public class IntegerRandomGenerator implements RandomGenerator<Integer>
{
  public Integer generateRandomNumWith(Integer bound)
  {
    return new Random().nextInt(bound);
  }
}
