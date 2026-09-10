class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        List<Integer> res=new ArrayList<>();
        if(k>s.length()){
            return res;
        }
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<k;i++){
            c1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<k;i++){
            c2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)){
            res.add(0);
        }
        for(int i=k;i<s.length();i++){
            c2[s.charAt(i-k)-'a']--;
            c2[s.charAt(i)-'a']++;

            if(Arrays.equals(c1,c2)){
                res.add(i-k+1);
            }
        }
        return res;
    }
}