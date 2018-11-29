package sorting;

public class BubbleSort {
  public void sort(int[] nums) {
    // All elements from sortedIdx and beyond will be sorted ascending
    int sortedIdx = nums.length - 1;
    boolean allSorted = false;
    while(!allSorted) {
      allSorted = true;
      for(int i = 0; i < sortedIdx; i++) {
        // The largest element will end up in place of nums[sortedIdx]
        if(nums[i] > nums[i+1]) {
          int temp = nums[i+1];
          nums[i+1] = nums[i];
          nums[i] = temp;
          allSorted = false;
        }
      }
      sortedIdx--;
    }
  }
}
