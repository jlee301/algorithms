package sorting;

import sorting.QuickSort;
import org.junit.Assert;
import org.junit.Test;

public class TestQuickSort {
  @Test
  public void testProblemCase1() {
    int[] nums = {10,9,8,7,6,5,4,3,2,1};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, nums);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,4,3,5,7,6,8,10,9};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, nums);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, nums);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {}, nums);
  }

  @Test
  public void testProblemCase5() {
    int[] nums = {1,3,4,4,4,5,2};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,4,4,5}, nums);
  }

  @Test
  public void testProblemCase6() {
    int[] nums = {5,5,5,5,5,5,5};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {5,5,5,5,5,5,5}, nums);
  }

  @Test
  public void testProblemCase7() {
    int[] nums = {3,2,1,5,1,2,3};
    QuickSort qs = new QuickSort();
    qs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,1,2,2,3,3,5}, nums);
  }
}
