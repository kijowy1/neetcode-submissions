class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int j = nums.length;
         for(int i=0;i<nums.length;i++){
            ans[i] = ans[i+j] = nums[i];
        }
         return ans;
    }
}