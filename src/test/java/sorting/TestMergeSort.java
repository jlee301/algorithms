package sorting;

import sorting.MergeSort;
import org.junit.Assert;
import org.junit.Test;

public class TestMergeSort {
  @Test
  public void testProblemCase1() {
    int[] nums = {10,9,8,7,6,5,4,3,2,1};
    MergeSort ms = new MergeSort();
    ms.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, nums);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,4,3,5,7,6,8,10,9};
    MergeSort ms = new MergeSort();
    ms.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, nums);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    MergeSort ms = new MergeSort();
    ms.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, nums);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {};
    MergeSort ms = new MergeSort();
    ms.sort(nums);
    Assert.assertArrayEquals(new int[] {}, nums);
  }
}
