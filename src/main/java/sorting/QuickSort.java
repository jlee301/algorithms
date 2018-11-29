package sorting;

public class QuickSort {
  public void sort(int[] nums) {
    quickSort(nums, 0, nums.length-1);
  }
  
  private void quickSort(int[] nums, int left, int right) {
    if(left >= right)
      return;
    
    // Choose middle value as the pivot
    int pivot = nums[left + (right - left) / 2];
    int index = partition(nums, left, right, pivot);
    quickSort(nums, left, index-1);
    quickSort(nums, index, right);
  }
  
  private int partition(int[] nums, int left, int right, int pivot) {
    while(left <= right) {
      // Find first value from the left that's greater than the pivot
      while(nums[left] < pivot)
        left++;
      
      // Find first value from the right that's less than the pivot
      while(nums[right] > pivot)
        right--;
      
      if(left <= right) {
        // Swap elements to be on the correct side of the pivot
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
      }
    }
    return left;
  }
}
