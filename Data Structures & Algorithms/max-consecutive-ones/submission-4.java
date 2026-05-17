class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0, highest = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                counter++;
                if(counter>highest){
                    highest=counter;
                } 
                //Could use highest = Math.max(counter,highest);
                //but couldn't find which one is faster
            }else{
                counter=0;
            }
        }
        return highest;
    }
}