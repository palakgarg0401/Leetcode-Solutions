//Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length, j=0;
        for(int i=1;i<k;i++){
            if(nums[i]!=nums[i-1]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}