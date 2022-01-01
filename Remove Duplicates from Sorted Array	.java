//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        int current=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else{
                nums[current++]=nums[i];
            }
        }
        return current;
    }
}
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]=101;
                continue;
            }
            count++;
        }
        Arrays.sort(nums);
        return count;
    }
}
*/
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        int resIndex=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                //System.out.println(nums[i]);
                resIndex++;
                nums[resIndex]=nums[i]; 
                //System.out.println(resIndex);
            }
        }
        //System.out.println(resIndex);
        return resIndex+1;
    }
}
*/
/*
class Solution {
    public int removeDuplicates(int[] nums) {
        // use set to record all known value and insert value and insert index if it is unknown
        Set seen_val = new HashSet<>();
        int n = nums.length;
        int insert_index = 0;
        for(int i = 0; i<n; i++){
            if (!seen_val.contains(nums[i])){
                seen_val.add(nums[i]);
                nums[insert_index] = nums[i];
                insert_index +=1;
            }
        }
        return insert_index;
    }
}
*/
