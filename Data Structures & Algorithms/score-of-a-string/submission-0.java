class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            int first = (char) s.charAt(i);
            int next = (char) s.charAt(i+1);
            sum+= Math.abs(first-next);
        }
        return sum;
    }
}