class Solution {
    public int totalFruit(int[] fruits) {
      int maxcount = 0;
      for(int i=0;i<fruits.length;i++){
          // set = basket
          HashSet<Integer> set = new HashSet<>();
          int j = i;

          while(j<fruits.length){
              if(!set.contains(fruits[j]) && set.size() == 2)
              break;
              
              set.add(fruits[j]);
              j++;
          }
          maxcount = Math.max(maxcount,j-i);
      }
      return maxcount;
        
        
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    

    
    
    
    
    
    
    
    
    
    
    
















    



    
