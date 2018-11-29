package sorting;

import sorting.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

public class TestBubbleSort {
  @Test
  public void testProblemCase1() {
    int[] nums = {5,4,3,2,1};
    BubbleSort bs = new BubbleSort();
    bs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5}, nums);
  }

  @Test
  public void testProblemCase2() {
    int[] nums = {1,2,4,3,5};
    BubbleSort bs = new BubbleSort();
    bs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5}, nums);
  }

  @Test
  public void testProblemCase3() {
    int[] nums = {1,2,3,4,5};
    BubbleSort bs = new BubbleSort();
    bs.sort(nums);
    Assert.assertArrayEquals(new int[] {1,2,3,4,5}, nums);
  }

  @Test
  public void testProblemCase4() {
    int[] nums = {};
    BubbleSort bs = new BubbleSort();
    bs.sort(nums);
    Assert.assertArrayEquals(new int[] {}, nums);
  }
}
