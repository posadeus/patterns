package it.mbm.creational.abstractfactory;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

import static java.util.List.of;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AbstractFactoryTest
{
  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Mock
  private RandomGenerator<Integer> randomGenerator;

  @Test
  public void waterPistol()
  {
    assertThat(new CreateWeapon(new WaterWeaponFactory(2)).createWeapon(),
               is(new WaterPistol(2)));
  }

  @Test
  public void potatoPistol()
  {
    context.checking(new Expectations()
    {{
      allowing(randomGenerator).generateRandomNumWith(100);
      will(returnValue(50));
    }});

    assertThat(new CreateWeapon(new PotatoPistolFactory(2, randomGenerator)).createWeapon(),
               is(new PotatoPistol(of(new Potato(50), new Potato(50)))));
  }
}
