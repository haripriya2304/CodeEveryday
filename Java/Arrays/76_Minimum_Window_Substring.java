class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i=0;i<t.length();i++) {
            char ch = t.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int start = 0;
        int count = t.length();

        int startindex = 0;
        int min = Integer.MAX_VALUE;

        for (int end = 0; end< s.length();end++) {

            char ch = s.charAt(end);
            if (freq.containsKey(ch) && freq.get(ch) > 0) {
                count--;
            }
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) - 1);
            }

           
            while (count == 0) {
               int len=end - start+ 1 ;
                if (len< min) {
                    min = len;
                    startindex = start;
                }

                char startchar = s.charAt(start);

                if (freq.containsKey(startchar)) {
                    freq.put(startchar, freq.get(startchar) + 1);

                 
                    if (freq.get(startchar) > 0) {
                        count++;
                    }
                }

                start++;
            }
        }

        return min == Integer.MAX_VALUE? "": s.substring(startindex, startindex + min);
    }
}
