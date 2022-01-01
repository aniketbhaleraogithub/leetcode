//https://leetcode.com/problems/running-sum-of-1d-array/
class Solution {
    public int[] runningSum(int[] nums) {
        int size=nums.length;
        if(size<=1){
            return nums;
        }
        int [] output= new int[size];
        output[0]=nums[0];
        for(int i=1;i<size;i++){
            output[i]=output[i-1]+nums[i];
        }
        return output;
    }
}
/*
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        
        return result;
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
         return nums;
    }
}
*/
