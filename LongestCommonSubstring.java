class longest{
   public int LongestCommonSubstring(String s){
    int maxlength = 0;
     for(int i=0;i<s.length();i++){
        StringBuilder currentsubstring = new StringBuilder();
        for(int j=i;j<s.length();j++){
            if(currentsubstring.indexOf(String.valueOf(s.charAt(j))) != -1){
                break;
            }
            currentsubstring.append(s.charAt(j));
            maxlength = Math.max(maxlength, currentsubstring.length());
        }
     }
    return maxlength;
   }
   
}
