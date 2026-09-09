class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        
        int[] c1=new int[26];
        int[] c2=new int[26];

        int k=s1.length();
        for(int i=0;i<k;i++){
            c1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<k;i++){
            c2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(c1,c2)){
            return true;
        }

        for(int i=k;i<s2.length();i++){
            c2[s2.charAt(i-k)-'a']--;
            c2[s2.charAt(i)-'a']++;
            
            if(Arrays.equals(c1,c2)){
                return true;
            }
        }
        return false;
    }
}