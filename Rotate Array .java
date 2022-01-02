class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int tempNums[]= nums.clone();
        int currentIndex=0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[currentIndex++]=tempNums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            nums[currentIndex++]=tempNums[i];
        }
    }
    
}
/*
public void rotate(int[] nums, int k) {
        
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1); // reverse the entire array
        reverse(nums, 0, k - 1);           // reverse the reversed array from 0 to 'k - 1'
        reverse(nums, k, nums.length - 1); // reverse the remaining elements (from k to nums.length - 1) back to their original
                                           // position
    }
    
    public void reverse(int[] nums, int i, int j) {

            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
    }
}
*/
/*
class Solution {
    public void rotate(int[] nums, int k) {
        //store the value to be replaced
        //when to terminate? When the original starting index is reached
        int steps = k % nums.length;
    
        int count = 0;
        for(int i = 0; i < steps; i++){
            int curr = i;
            //int next = (curr + steps) % nums.length;
            int prev = nums[curr];
            int temp = 0;
            System.out.println("***");
            do {
                System.out.println(curr);
                count++;
                curr = (curr + steps) % nums.length;

                temp = prev;
                prev = nums[curr];
                nums[curr] = temp;
                

             //   curr = next;
             //   next = (curr + steps) % nums.length;
            } while (curr != i);
            nums[curr] = temp;  
            
            if(count == nums.length){
                return;
            }
        }
     
    }
}
*/
