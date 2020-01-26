package it.mbm.structural.delegate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DelegateTest
{
  @Test
  public void rectangularWindow()
  {
    assertThat(new Window(new RectangularShape(2, 5)).area(), is(10.00));
  }

  @Test
  public void circularWindow()
  {
    assertThat(new Window(new CircularShape(5)).area(), is(78.53981633974483));
  }
}