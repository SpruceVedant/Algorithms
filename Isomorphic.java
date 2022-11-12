import java.util.Hashtable;

class iso{
    public static void main(String[] args) {
        Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
        String s = "egg";
        String t = "add";
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            if(ht.containsKey(s.charAt(i))){
                if(ht.get(s.charAt(i)) != t.charAt(i)){
                    flag = false;
                    break;
                }
            }
            else{
                if(ht.containsValue(t.charAt(i))){
                    flag = false;
                    break;
                }
                ht.put(s.charAt(i), t.charAt(i));
            }   
        }
        if(flag){
            System.out.println("Isomorphic");
        }
        else{
            System.out.println("Not Isomorphic");
        }
        
    }
}
