class Solution {
    public void reverseString(char[] s) {
        int j = s.length;
        for(int i=0;i<s.length/2;i++){
            char temp;
            temp = s[i];
            s[i] = s[j-i-1];
            s[j-i-1] = temp;
        }
    }
}