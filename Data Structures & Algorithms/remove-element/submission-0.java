class Solution {
    public int removeElement(int[] nums, int val) {
        int idex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[idex] = nums[i];
                idex++;
            }
        }
        return idex;
    }
}