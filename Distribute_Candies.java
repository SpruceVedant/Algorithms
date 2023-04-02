class Solution {
    public int distributeCandies(int[] candyType) {
      int  maxCandy = candyType.length/2;
      Set<Integer> unique = new HashSet<>();

      for(int i=0;i<candyType.length;i++){
        unique.add(candyType[i]);

        if(unique.size() == maxCandy){
          return maxCandy;
        }

      }
      return unique.size();
    }
}
