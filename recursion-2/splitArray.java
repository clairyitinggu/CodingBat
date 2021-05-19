/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)

splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
*/

public boolean splitArray(int[] nums) {
      return splitArrayHelper(0, nums, 0, 0);
}

public boolean splitArrayHelper(int start, int[] nums, int group1,
    int group2) {
    if(start >= nums.length)
        return group1 == group2;

    if(splitArrayHelper(start+1, nums, group1 + nums[start], group2))
        return true;

    if(splitArrayHelper(start+1, nums, group1, group2 + nums[start]))
        return true;

    return false;
//   int result = helper(nums,0,nums.length-1);
//   return result != -1 ? true:false;
// }

// public int helper(int[] nums, int start,int end){
//   if(nums.length ==1){
//     return -1;
//   }
//   if(nums.length == 0){
//     return 0;
//   }

//   if(nums[start] == nums[end]){
//     return start;
//   }

//   if(nums[start] > nums[end] && end -1 >0){
//     return nums[end] + helper(nums,start, end -1);
//   }

//   if(nums[start]<nums[end] && start +1 > nums.length){
//     return nums[start] + helper(nums,start+1, end);
//   }

//   return -1;


}
