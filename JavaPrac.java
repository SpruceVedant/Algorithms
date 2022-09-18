
class javaprac{
    public static String capgeminniAlex(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        char currchar = word.charAt(0);
        int longestStart = 0;
        int longestLength = 0;
        int currstart = 0;
        int currlength = 1;
        for (int ix = 1; ix < word.length(); ix++) {
            if (word.charAt(ix) == currchar) {
                currlength++;
            } else {
                if (currlength > longestLength) {
                    longestStart = currstart;
                    longestLength = currlength;
                }
                currchar = word.charAt(ix);
                currstart = ix;
                currlength = 1;
            }
        }
        if (currlength > longestLength) {
            longestStart = currstart;
            longestLength = currlength;
        }
        return word.substring(longestStart, longestStart + longestLength);
    }
    public static void main(String[] args) {
        String s = "abbb";
        System.out.println(capgeminniAlex(s).length());
    }
}
// output will be 3
