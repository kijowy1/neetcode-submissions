class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        while(sb.length()!=word1.length()+word2.length()){
            if(a<word1.length()){
                sb.append(word1.charAt(a));
                a++;
            }
            if(b<word2.length()){
                sb.append(word2.charAt(b));
                b++;
            }
        }
        return sb.toString();
    }
}