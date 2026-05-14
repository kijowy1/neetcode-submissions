class Solution {
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i:nums){
            set.add(i);
        }
        if(set.size()==nums.length){
            return false;
        }
        return true;

    }
}