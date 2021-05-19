/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
*/

public boolean splitOdd10(int[] nums) {

  return helper(0,nums,0,0);
}

public boolean helper(int start, int[] nums,int group1, int group2){

  if(start >= nums.length) return group1 % 10 == 0 && group2 % 2 != 0 ;

  if(nums[start] % 10 == 0){
    return helper(start + 1,nums, group1 + nums[start],group2 );
  }

  if(nums[start] % 2 != 0){
    return helper(start + 1,nums, group1 , group2 + nums[start]);
  }
  if(helper(start + 1,nums, group1 + nums[start],group2 )) return true;
  if(helper(start + 1,nums, group1 , group2 + nums[start])) return true;

  return false;

}
