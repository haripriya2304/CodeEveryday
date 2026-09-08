class Solution {
    public int maxVowels(String s, int k) {
        int[] freq=new int[26];
        freq['a'-'a']=1;
        freq['e'-'a']=1;
        freq['i'-'a']=1;
        freq['o'-'a']=1;
        freq['u'-'a']=1;
        int count=0;
        for(int i=0;i<k;i++){
            if (freq[s.charAt(i)-'a']==1){
                count++;
            }
            
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            if (freq[s.charAt(i-k)-'a']==1){
                count--;
            }
            if (freq[s.charAt(i)-'a']==1){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
