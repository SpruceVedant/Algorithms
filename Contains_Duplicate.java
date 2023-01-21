import java.util.HashSet;

class dup{
    public boolean isDuplicate(int nums[]){
        if(nums == 0 || nums.length == 0) return false;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}