class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxLength=0;
        int start =0;
        int i=0;
        for(i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(i-start > maxLength){
                    maxLength = i-start;
                }
                start= Math.max(hm.get(s.charAt(i))+1,start);
                // System.out.println(s.charAt(i)+" "+start+" "+i);
                hm.put(s.charAt(i),i);
             
            }
            else{
                hm.put(s.charAt(i),i);
            }
        }
        // System.out.println(i+" "+start+" "+maxLength);
        if(i-start > maxLength){
            maxLength = i-start;
        }
        return maxLength;
    }
}