

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), s.charAt(i));
            }
        }
        boolean ifAlluniqie = new HashSet<>(map.values()).size()==map.size();
        StringBuilder sb = new StringBuilder();
        if(ifAlluniqie) {
            for (int i = 0; i < t.length(); i++) {
                sb.append(map.get(t.charAt(i)));
            }
        }
        return sb.toString().equals(s);

    }
}