package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Екатерина on 11/27/2018.
 */
public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,1);
    Point p3 = new Point(3,4);
    Assert.assertEquals(p1.distance(p2), 1.0);
    Assert.assertEquals(p1.distance(p3), 5.0);
    Assert.assertEquals(p2.distance(p3), 4.2);
  }
}
