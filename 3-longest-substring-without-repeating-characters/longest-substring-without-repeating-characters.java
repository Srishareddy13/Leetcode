class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> map=new HashMap<>();

        int start=0;
        int maxlen=0;

        for(int end=0;end<s.length();end++){

            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                start=Math.max(start,map.get(ch)+1);
            }

            map.put(ch,end);

            maxlen=Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
}