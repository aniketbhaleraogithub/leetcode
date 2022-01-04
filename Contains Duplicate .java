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
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i<nums.length; i++) {
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
*/
