class Solution {
    public boolean validPalindrome(String s) {
        int sLength = s.length();
        boolean canRemove = true;
        boolean canRemoveLeft = false;
        boolean canRemoveRight = false;
        for(int i=0;i<=sLength/2;i++) {
            int secondPointer = sLength - i - 1;
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                if (canRemove){
                    if(ifRestIsPalindrome(i+1,secondPointer,s)){
                        return true;
                    }else if(ifRestIsPalindrome(i,secondPointer-1,s)){
                        return true;
                    }else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean ifRestIsPalindrome(int start, int end, String s){
        int left = start;
        int right = end;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

}