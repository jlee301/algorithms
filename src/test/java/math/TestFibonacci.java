package math;

import math.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class TestFibonacci {
  @Test
  public void testProblemCase1() {
    int n = 0;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(0, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase2() {
    int n = 1;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(1, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase3() {
    int n = 2;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(1, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase4() {
    int n = 3;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(2, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase5() {
    int n = 4;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(3, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase6() {
    int n = 5;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(5, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase7() {
    int n = 6;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(8, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase8() {
    int n = 7;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(13, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase9() {
    int n = 8;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(21, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase10() {
    int n = 9;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(34, fib.fibTopDown(n));
  }

  @Test
  public void testProblemCase11() {
    int n = 0;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(0, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase12() {
    int n = 1;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(1, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase13() {
    int n = 2;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(1, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase14() {
    int n = 3;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(2, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase15() {
    int n = 4;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(3, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase16() {
    int n = 5;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(5, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase17() {
    int n = 6;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(8, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase18() {
    int n = 7;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(13, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase19() {
    int n = 8;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(21, fib.fibBottomUp(n));
  }

  @Test
  public void testProblemCase20() {
    int n = 9;
    Fibonacci fib = new Fibonacci();
    Assert.assertEquals(34, fib.fibBottomUp(n));
  }
}
