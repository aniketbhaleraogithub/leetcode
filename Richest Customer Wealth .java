//https://leetcode.com/problems/richest-customer-wealth/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
/*
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int[] r : accounts) {
            ans = Math.max(ans, IntStream.of(r).sum());
        }
        return ans;
    }
}
*/
/*
class Solution {
    public int maximumWealth(int[][] accounts) {
        int value = 0;
        int maxValue = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            value = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                value = value + accounts[i][j];
            }
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
*/
