class Solution {
    public int[] replaceElements(int[] arr) {
        int sol[] = new int[arr.length];
        int index = -1;
        for(int i=arr.length-1;i>=0;i--){
            sol[i]=index;
            index = Math.max(arr[i],index);
        }
        return sol;
    }
}