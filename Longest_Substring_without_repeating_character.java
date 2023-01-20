class sub{
    public int LongestSubstring(String s){
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0,j=0;i<s.length();i++){
            if(map.conatainsKey(s.charAt(i))){
                j = Math.max(map.get(s.charAt(i)),j);
            }
            count = Math.max(count,i-j+1);
            map.put(s.charAt(j),j+1);
        }
        return count;
    }
}