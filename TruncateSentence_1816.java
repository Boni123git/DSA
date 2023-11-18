class Solution {
    public String truncateSentence(String s, int k) {
      String[] tokens = s.split("\s");
        String res = tokens[0];
        for(int i = 1 ; i < k ; i++){
            res += ' ' + tokens[i];
        }
        return res;
    }
}
