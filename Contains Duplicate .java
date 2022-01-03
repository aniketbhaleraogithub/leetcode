//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean status=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                status=true;
                break;
            }
        }
        return status;
    }
}

/*
*/
