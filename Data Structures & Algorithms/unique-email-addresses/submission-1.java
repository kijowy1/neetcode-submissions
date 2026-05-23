

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> map = new HashSet<>();
        for (String mail : emails) {
            StringBuilder sb = new StringBuilder();
            boolean before = true;
            boolean isItAfterPlus = false;
            for (int j = 0; j < mail.length(); j++) {
                if (mail.charAt(j) == '@') {
                    before = false;
                    sb.append(mail.charAt(j));
                } else if (mail.charAt(j) == '+' && before) {
                    isItAfterPlus = true;
                } else if (mail.charAt(j) != '.' && !isItAfterPlus && before) {
                    sb.append(mail.charAt(j));
                } else if (!before) {
                    sb.append(mail.charAt(j));
                }
            }
            map.add(sb.toString());
        }
        return map.size();
    
    }

}
