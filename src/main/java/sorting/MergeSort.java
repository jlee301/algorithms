package sorting;

public class MergeSort {
  public void sort(int[] nums) {
    mergeSort(nums, new int[nums.length], 0, nums.length-1);
  }
  
  private void mergeSort(int[] nums, int[] temp, int leftStart, int rightEnd) {
    if(leftStart >= rightEnd)
      return;
    
    int mid = leftStart + (rightEnd - leftStart) / 2;
    mergeSort(nums, temp, leftStart, mid);
    mergeSort(nums, temp, mid+1, rightEnd);
    mergeHalves(nums, temp, leftStart, rightEnd);
  }
  
  private void mergeHalves(int[] nums, int[] temp, int leftStart, int rightEnd) {
    int leftEnd = leftStart + (rightEnd - leftStart) / 2;
    int rightStart = leftEnd + 1;
    
    // left and right will be used later for writing back into nums
    int left = leftStart;
    int right = rightEnd;
    
    // Store sorted elements into temp
    int writeIdx = rightEnd;
    while(leftEnd >= leftStart && rightEnd >= rightStart) {
      if(nums[leftEnd] <= nums[rightEnd])
        temp[writeIdx--] = nums[rightEnd--];
      else
        temp[writeIdx--] = nums[leftEnd--];
    }
    
    // Populate remaining entries into temp if it exist
    while(leftEnd >= leftStart)
      temp[writeIdx--] = nums[leftEnd--];
    while(rightEnd >= rightStart)
      temp[writeIdx--] = nums[rightEnd--];
    
    // Now populate sorted temp section back into nums
    while(left <= right) {
      nums[left] = temp[left];
      left++;
    }
  }
}
