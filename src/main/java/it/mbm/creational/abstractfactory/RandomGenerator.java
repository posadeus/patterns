package it.mbm.creational.abstractfactory;

public interface RandomGenerator<T>
{
  T generateRandomNumWith(T bound);
}
