
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        int[] f = new int[flowerbed.length+2];
        for(int i=0;i<flowerbed.length;i++){
            f[i+1] = flowerbed[i];
        }

        for(int i=1;i<f.length-1;i++) {
            int preFix = f[i - 1];
            int postFix = f[i + 1];
            if((preFix ==0 && postFix ==0 && f[i] ==0)){
                counter++;
                f[i]=1;
            }
        }
        return counter >= n;
    }
}